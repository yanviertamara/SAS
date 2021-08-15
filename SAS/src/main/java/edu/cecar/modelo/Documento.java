/**
 *Clase: Documento
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
package edu.cecar.modelo;

import java.io.Serializable;

import java.util.List;

/**
 * Clase que modela el objeto Documento
 *
 */
public class Documento implements Serializable {

    private static final long serialVersionUID = 103L;

    private String nombreArchivo;

    private byte[] bytesArchivo;
    
    private List<String> cellsLeft;
    
    private List<String> cellsRight;

    public Documento(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public byte[] getBytesArchivo() {
        return bytesArchivo;
    }

    public void setBytesArchivo(byte[] bytesArchivo) {
        this.bytesArchivo = bytesArchivo;
    }

    public List<String> getCellsLeft() {
        return cellsLeft;
    }

    public void setCellsLeft(List<String> cellsLeft) {
        this.cellsLeft = cellsLeft;
    }

    public List<String> getCellsRight() {
        return cellsRight;
    }

    public void setCellsRight(List<String> cellsRight) {
        this.cellsRight = cellsRight;
    }
    
    
}
