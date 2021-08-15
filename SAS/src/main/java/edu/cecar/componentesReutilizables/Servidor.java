/*
 * Clase: Servidor
 *
 * Version: 1.0
 *
 * Fecha: 2014-10-10
 *
 * Autor: Ing. Jhon Jaime Mendez
 *
 * Copyrigth: JAsoft
 */
package edu.cecar.componentesReutilizables;

/**
 * Servidor FTP
 */
import edu.cecar.controlador.ServidorHilo;

final public class Servidor {

    public static void main(String[] args) {

        ServerSocketObjeto serverSocketObjeto = new ServerSocketObjeto(7000);

        System.out.println("Servidor de FTP montado");

        //Se reciben n peticiones
        while (true) {

            try {

                serverSocketObjeto.esperarConexion();

                //Las conexiones para cada socket se administran sobre un hilo diferente
                System.out.println("Hilo Creado");
                ServidorHilo socketHilo = new ServidorHilo(serverSocketObjeto.getEntrada(), serverSocketObjeto.getSalida());
                socketHilo.start();

            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

    }

}
