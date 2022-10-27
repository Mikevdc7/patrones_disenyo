package org.mvallesg.patrones.singleton;

public class ConexionBDSingleton {

    private static ConexionBDSingleton conexionBD;

    private ConexionBDSingleton() {
        System.out.println("Simulación de conexión a la bbdd...");
    }

    public static ConexionBDSingleton getInstance(){
        if(conexionBD==null){
            conexionBD = new ConexionBDSingleton();
        }
        return conexionBD;
    }
}