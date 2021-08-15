/**
 *Clase: ControladorDescarga
 *
 *@version: 0.1
 *
 *Fecha de Creación: 1/05/2020
 *
 *Fecha de Modificación: 
 *
 *@autor: Yanvier
 *
 *Copyright: CECAR
 *
*/
package edu.cecar.controlador;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * 
 */
public class ControladorDescarga {
    
    public void descargarArchivo(){
        try {
			// Url con la foto
			URL url = new URL("https://drive.google.com/uc?id=1F95C1VBAcYCa0yVEPK6NHimg2F1u5Dhb&export=download&authuser=0");

			// establecemos conexion
			URLConnection urlCon = url.openConnection();

			// Se obtiene el inputStream de la foto web y se abre el fichero
			// local.
			InputStream is = urlCon.getInputStream();
			FileOutputStream fos = new FileOutputStream("descargasServidor\\Archivo.pdf");

			
			byte[] array = new byte[1000]; // buffer temporal de lectura.
			int leido = is.read(array);
			while (leido > 0) {
				fos.write(array, 0, leido);
				leido = is.read(array);
			}

			// cierre de conexion y fichero.
                        System.out.println("Descarga Exitosa");
			is.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

}
