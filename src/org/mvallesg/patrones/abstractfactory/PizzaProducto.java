package org.mvallesg.patrones.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaProducto {

    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public PizzaProducto() {
        this.ingredientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getMasa() {
        return masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void preparar(){
         System.out.println("Preparando " + nombre);
         System.out.println("Seleccionando la masa " + masa);
         System.out.println("Agregando salsa " + salsa);
         System.out.println("Agregando ingredientes...");
         this.ingredientes.forEach(System.out::println);
     }

     abstract public void cocinar();

     abstract public void cortar();

     public void empaquetar(){
         System.out.println("Poniendo la pizza en una caja de empaque...");
     }

    @Override
    public String toString() {
        return "PizzaProducto{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}