package org.mvallesg.patrones.abstractfactory.producto;

import org.mvallesg.patrones.abstractfactory.PizzaProducto;

public class PizzaNewYorkPepperoni extends PizzaProducto {

    public PizzaNewYorkPepperoni() {
        super();
        nombre = "Pizza Pepperoni Nueva York";
        masa = "Masa delgada a la piedra";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Extra pepperoni");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando durante 40 min. a 90ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triángulos.");
    }
}