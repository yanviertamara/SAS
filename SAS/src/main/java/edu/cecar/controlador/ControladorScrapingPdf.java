/**
 *Clase: ControladorScrapingPdf
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

import java.awt.geom.Rectangle2D;

import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripperByArea;

/**
 * Clase que controla el scraping del PDF
 *
 */
public class ControladorScrapingPdf {


    public String getTextPDF(int pag, int x, int y, int ancho, int alto) throws IOException { // Metodo para crear scrapear el pdf por secciones
        String filepath = "descargasServidor\\Archivo.pdf";

        PDDocument document = PDDocument.load(new File(filepath));

        int page = pag;
        int width = ancho;
        int height = alto;

        PDFTextStripperByArea textStripper = new PDFTextStripperByArea();
        textStripper.setSortByPosition(true);
        Rectangle2D rect = new java.awt.geom.Rectangle2D.Float(x, y, width, height);
        textStripper.addRegion("region", rect);

        PDPage docPage = document.getPage(page);

        textStripper.extractRegions(docPage);

        String textForRegion = textStripper.getTextForRegion("region");

        document.close();
        return textForRegion;
    }

    public List<String> getTextLeft() throws IOException { //Metodo para obtener los datos del lado Izquierdo de la tabla
        List<String> contenido = new ArrayList<>();
        //pag 1
        contenido.add(getTextPDF(0, -375, 210, 640, 25));

        contenido.add(getTextPDF(0, -375, 230, 648, 35));

        contenido.add(getTextPDF(0, -375, 250, 648, 25));

        contenido.add(getTextPDF(0, -375, 285, 648, 25));

        contenido.add(getTextPDF(0, -375, 310, 660, 25));

        contenido.add(getTextPDF(0, -375, 340, 660, 25));

        contenido.add(getTextPDF(0, -375, 380, 660, 25));

        contenido.add(getTextPDF(0, -375, 415, 660, 25));

        contenido.add(getTextPDF(0, -375, 445, 660, 25));

        contenido.add(getTextPDF(0, -375, 475, 670, 25));

        contenido.add(getTextPDF(0, -375, 495, 670, 25));

        contenido.add(getTextPDF(0, -375, 525, 670, 25));

        contenido.add(getTextPDF(0, -375, 575, 670, 25));

        contenido.add(getTextPDF(0, -375, 605, 670, 25));

        contenido.add(getTextPDF(0, -375, 635, 670, 25));

        contenido.add(getTextPDF(0, -375, 675, 670, 25));

        contenido.add(getTextPDF(0, -375, 705, 670, 25));

        contenido.add(getTextPDF(0, -375, 735, 670, 25));

        contenido.add(getTextPDF(0, -375, 765, 670, 25));

        //pag2
        contenido.add(getTextPDF(1, -375, 55, 650, 25));

        contenido.add(getTextPDF(1, -375, 75, 648, 25));

        contenido.add(getTextPDF(1, -375, 100, 648, 25));

        contenido.add(getTextPDF(1, -375, 120, 650, 25));

        contenido.add(getTextPDF(1, -375, 150, 650, 25));

        contenido.add(getTextPDF(1, -375, 170, 650, 25));

        contenido.add(getTextPDF(1, -375, 200, 650, 25));

        contenido.add(getTextPDF(1, -375, 230, 650, 25));

        contenido.add(getTextPDF(1, -375, 240, 650, 25));

        contenido.add(getTextPDF(1, -375, 320, 650, 25));

        contenido.add(getTextPDF(1, -375, 360, 650, 25));

        contenido.add(getTextPDF(1, -375, 400, 650, 25));

        contenido.add(getTextPDF(1, -375, 420, 650, 25));

        contenido.add(getTextPDF(1, -375, 480, 650, 25));

        contenido.add(getTextPDF(1, -375, 520, 650, 25));

        contenido.add(getTextPDF(1, -375, 550, 650, 25));

        contenido.add(getTextPDF(1, -375, 620, 650, 25));

        contenido.add(getTextPDF(1, -375, 650, 650, 35));

        contenido.add(getTextPDF(1, -375, 685, 650, 25));

        contenido.add(getTextPDF(1, -375, 745, 650, 25));

        contenido.add(getTextPDF(1, -375, 775, 650, 25));

        //pag3
        contenido.add(getTextPDF(2, -375, 55, 650, 25));

        contenido.add(getTextPDF(2, -375, 75, 650, 25));

        contenido.add(getTextPDF(2, -375, 145, 650, 25));

        contenido.add(getTextPDF(2, -375, 175, 650, 25));

        contenido.add(getTextPDF(2, -375, 195, 650, 25));

        contenido.add(getTextPDF(2, -375, 225, 650, 25));

        contenido.add(getTextPDF(2, -375, 295, 650, 25));

        contenido.add(getTextPDF(2, -375, 325, 650, 25));

        contenido.add(getTextPDF(2, -375, 355, 650, 25));

        contenido.add(getTextPDF(2, -375, 395, 650, 25));

        contenido.add(getTextPDF(2, -375, 415, 650, 25));

        contenido.add(getTextPDF(2, -375, 435, 650, 25));

        contenido.add(getTextPDF(2, -375, 495, 650, 25));

        contenido.add(getTextPDF(2, -375, 525, 650, 25));

        contenido.add(getTextPDF(2, -375, 555, 650, 25));

        contenido.add(getTextPDF(2, -375, 595, 650, 45));

        contenido.add(getTextPDF(2, -375, 635, 650, 25));

        contenido.add(getTextPDF(2, -375, 665, 650, 25));

        contenido.add(getTextPDF(2, -375, 685, 650, 25));

        contenido.add(getTextPDF(2, -375, 725, 650, 25));

        contenido.add(getTextPDF(2, -375, 755, 650, 25));

        contenido.add(getTextPDF(2, -375, 775, 650, 25));

        return contenido;
    }

    public List<String> getTextRight() throws IOException {//Metodo para obtener los datos del lado derecho de la tabla 
        List<String> contenido = new ArrayList<>();
        //pag 1

        contenido.add(getTextPDF(0, 290, 215, 648, 25));

        contenido.add(getTextPDF(0, 290, 235, 648, 25));

        contenido.add(getTextPDF(0, 290, 265, 648, 25));

        contenido.add(getTextPDF(0, 290, 285, 648, 25));

        contenido.add(getTextPDF(0, 290, 315, 648, 35));

        contenido.add(getTextPDF(0, 290, 355, 648, 35));

        contenido.add(getTextPDF(0, 290, 395, 648, 25));

        contenido.add(getTextPDF(0, 290, 415, 648, 25));

        contenido.add(getTextPDF(0, 290, 445, 648, 35));

        contenido.add(getTextPDF(0, 290, 485, 648, 25));

        contenido.add(getTextPDF(0, 290, 515, 648, 25));

        contenido.add(getTextPDF(0, 290, 545, 648, 25));

        contenido.add(getTextPDF(0, 290, 575, 648, 25));

        contenido.add(getTextPDF(0, 290, 605, 648, 25));

        contenido.add(getTextPDF(0, 290, 640, 648, 35));

        contenido.add(getTextPDF(0, 290, 680, 648, 35));

        contenido.add(getTextPDF(0, 290, 720, 648, 25));

        contenido.add(getTextPDF(0, 290, 745, 648, 25));

        contenido.add(getTextPDF(0, 290, 775, 648, 25));
        //pag2
        contenido.add(getTextPDF(1, 290, 55, 650, 25));

        contenido.add(getTextPDF(1, 290, 75, 650, 25));

        contenido.add(getTextPDF(1, 290, 100, 650, 25));

        contenido.add(getTextPDF(1, 290, 130, 650, 25));

        contenido.add(getTextPDF(1, 290, 160, 650, 25));

        contenido.add(getTextPDF(1, 290, 190, 650, 25));

        contenido.add(getTextPDF(1, 290, 210, 650, 25));

        contenido.add(getTextPDF(1, 290, 230, 650, 25));

        contenido.add(getTextPDF(1, 290, 258, 650, 65));

        contenido.add(getTextPDF(1, 290, 330, 650, 35));

        contenido.add(getTextPDF(1, 290, 375, 650, 35));

        contenido.add(getTextPDF(1, 290, 405, 650, 25));

        contenido.add(getTextPDF(1, 290, 425, 650, 55));

        contenido.add(getTextPDF(1, 290, 485, 650, 25));

        contenido.add(getTextPDF(1, 290, 525, 650, 25));

        contenido.add(getTextPDF(1, 290, 555, 650, 65));

        contenido.add(getTextPDF(1, 290, 625, 650, 25));

        contenido.add(getTextPDF(1, 290, 655, 650, 25));

        contenido.add(getTextPDF(1, 290, 685, 650, 55));

        contenido.add(getTextPDF(1, 290, 745, 650, 25));

        contenido.add(getTextPDF(1, 290, 775, 650, 25));
        //pag3

        contenido.add(getTextPDF(2, 290, 55, 650, 25));

        contenido.add(getTextPDF(2, 290, 75, 650, 45));

        contenido.add(getTextPDF(2, 290, 145, 650, 25));

        contenido.add(getTextPDF(2, 290, 175, 650, 25));

        contenido.add(getTextPDF(2, 290, 205, 650, 35));

        contenido.add(getTextPDF(2, 290, 245, 650, 55));

        contenido.add(getTextPDF(2, 290, 305, 650, 25));

        contenido.add(getTextPDF(2, 290, 325, 650, 25));

        contenido.add(getTextPDF(2, 290, 355, 650, 35));

        contenido.add(getTextPDF(2, 290, 390, 650, 25));

        contenido.add(getTextPDF(2, 290, 415, 650, 25));

        contenido.add(getTextPDF(2, 290, 450, 650, 35));

        contenido.add(getTextPDF(2, 290, 495, 650, 35));

        contenido.add(getTextPDF(2, 290, 535, 650, 25));

        contenido.add(getTextPDF(2, 290, 565, 650, 25));

        contenido.add(getTextPDF(2, 290, 595, 650, 25));

        contenido.add(getTextPDF(2, 290, 625, 650, 45));

        contenido.add(getTextPDF(2, 290, 675, 650, 25));

        contenido.add(getTextPDF(2, 290, 705, 650, 25));

        contenido.add(getTextPDF(2, 290, 725, 650, 25));

        contenido.add(getTextPDF(2, 290, 755, 650, 25));

        contenido.add(getTextPDF(2, 290, 775, 650, 25));

        return contenido;
    }
}
