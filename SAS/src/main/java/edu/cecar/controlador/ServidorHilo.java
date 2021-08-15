/**
 *Clase: ServidorHilo
 *
 *@version: 0.1
 *
 *Fecha de Creación: 30/04/2020
 *
 *Fecha de Modificación:
 *
 *@autor: Yanvier
 *
 *Copyright: CECAR
 *
 */
package edu.cecar.controlador;

import edu.cecar.modelo.Documento;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Clase que controla el hilo que atiende las conexiones de los diferentes clientes FTP
 *
 */
final public class ServidorHilo extends Thread {
    
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    
    public ServidorHilo(ObjectInputStream entrada, ObjectOutputStream salida) {
        
        this.entrada = entrada;
        this.salida = salida;
    }
    
    @Override
    public void run() {
        
        try {
            
            while (true) {
                
                ControladorDescarga controlDescarga = new ControladorDescarga();
                
                ControladorApachePOI controlPOI = new ControladorApachePOI();
                
                ControladorScrapingPdf scrapingPdf = new ControladorScrapingPdf();
                
                Object object = entrada.readObject();
                
                Documento documento = (Documento) object;
                
                String nombreArchivo = documento.getNombreArchivo();
                
                controlDescarga.descargarArchivo();
                
                controlPOI.setTextDoc(scrapingPdf.getTextLeft(), scrapingPdf.getTextRight(), nombreArchivo);
                
                File file = new File("DescargasServidor\\" + documento.getNombreArchivo());
                
                FileInputStream fileInputStream = new FileInputStream(file);
                
                byte[] bytes = new byte[(int) file.length()];
                
                int numerosBytesLeidos = fileInputStream.read(bytes);
                
                fileInputStream.close();
                
                documento.setBytesArchivo(bytes);
                
                documento.setCellsLeft(scrapingPdf.getTextLeft());
                
                documento.setCellsRight(scrapingPdf.getTextRight());
                
                salida.writeObject(documento);
                
            }
            
        } catch (Exception e) {
            
            System.out.println("Cliente cerro la conexion");
        }
        
    }
}
