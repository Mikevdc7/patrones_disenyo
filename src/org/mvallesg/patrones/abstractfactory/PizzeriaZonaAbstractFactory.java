package org.mvallesg.patrones.abstractfactory;

public abstract class PizzeriaZonaAbstractFactory {

    public PizzaProducto pedirPizza(String tipo){
        PizzaProducto pizza = crearPizza(tipo);
        System.out.println("-----Fabricando la pizza " + pizza.getNombre() + "-----");
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }

    abstract PizzaProducto crearPizza(String tipo);
}
