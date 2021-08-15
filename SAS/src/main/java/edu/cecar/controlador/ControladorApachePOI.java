/**
 *Clase: ControladorApachePOI
 *
 *@version: 0.1
 *
 *Fecha de Creación: 29/04/2020
 *
 *Fecha de Modificación:
 *
 *@autor: Yanvier
 *
 *Copyright: CECAR
 *
 */
package edu.cecar.controlador;

import java.io.File;
import java.io.FileOutputStream;

import java.util.List;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *Clase que controla la creacion del archivo .doc
 *
 */
public class ControladorApachePOI {

    public void setTextDoc(List<String> izq, List<String> der, String nombreArchivo) {//Metodo de escritura del archivo .doc
        try {

            XWPFDocument documento = new XWPFDocument();

            FileOutputStream fileOutpuStream = new FileOutputStream(new File("descargasServidor\\" + nombreArchivo));

            XWPFParagraph parrafo = documento.createParagraph();

            parrafo = documento.createParagraph();

            parrafo.setAlignment(ParagraphAlignment.CENTER);

            XWPFRun run = parrafo.createRun();

            run.setText("Name of the Sports Events");

            for (String text : izq) {

                parrafo = documento.createParagraph();

                parrafo.setAlignment(ParagraphAlignment.LEFT);

                run = parrafo.createRun();

                run.setText(text);
            }

            parrafo = documento.createParagraph();

            parrafo.setAlignment(ParagraphAlignment.CENTER);

            run = parrafo.createRun();

            run.setText("Name of the Winners");

            for (String text : der) {

                parrafo = documento.createParagraph();

                parrafo.setAlignment(ParagraphAlignment.LEFT);

                run = parrafo.createRun();

                run.setText(text);
            }

            documento.write(fileOutpuStream);
            fileOutpuStream.close();
            documento.close();

            System.out.println("Archivo creado de manera exitosa");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

}
