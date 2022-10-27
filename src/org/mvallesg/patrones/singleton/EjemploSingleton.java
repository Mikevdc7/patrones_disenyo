package org.mvallesg.patrones.singleton;

public class EjemploSingleton {
    public static void main(String[] args) {

        for(int i=0; i<10; i++){
            ConexionBDSingleton conexion = ConexionBDSingleton.getInstance();
            System.out.println("conexion = " + conexion);
        }
    }
}