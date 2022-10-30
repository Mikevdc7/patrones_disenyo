package org.mvallesg.patrones.abstractfactory.ejemplo;

import org.mvallesg.patrones.abstractfactory.PizzaProducto;
import org.mvallesg.patrones.abstractfactory.PizzeriaCaliforniaFactory;
import org.mvallesg.patrones.abstractfactory.PizzeriaNewYorkFactory;
import org.mvallesg.patrones.abstractfactory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {

        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory ca = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = ca.pedirPizza("queso");
        System.out.println("Mike pide la pizza " + pizza.getNombre());

        pizza = ny.pedirPizza("pepperoni");
        System.out.println("Mike se ha quedado con hambre y ahora pide la pizza " + pizza.getNombre());

        pizza = ca.pedirPizza("vegetariana");
        System.out.println("Mike se ha hecho amigo de los animales y ahora pide la pizza " + pizza.getNombre());

        pizza = ny.pedirPizza("vegetariana");
        System.out.println("Mike ahora pide la pizza " + pizza.getNombre());

        pizza = ca.pedirPizza("pepperoni");
        System.out.println("Mike quiere la pizza " + pizza.getNombre());

        System.out.println("pizza = " + pizza);
    }
}