package org.mvallesg.patrones.abstractfactory;

import org.mvallesg.patrones.abstractfactory.producto.PizzaNewYorkItaliana;
import org.mvallesg.patrones.abstractfactory.producto.PizzaNewYorkPepperoni;
import org.mvallesg.patrones.abstractfactory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{


    @Override
    public PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
        return producto;
    }
}
