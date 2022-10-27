package org.mvallesg.patrones.abstractfactory;

import org.mvallesg.patrones.abstractfactory.producto.PizzaNewYorkItaliana;
import org.mvallesg.patrones.abstractfactory.producto.PizzaNewYorkPepperoni;
import org.mvallesg.patrones.abstractfactory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{


    @Override
    public PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "vegetariana":
                producto = new PizzaNewYorkVegetariana();
                break;
            case "pepperoni":
                producto = new PizzaNewYorkPepperoni();
                break;
            case "italiana":
                producto = new PizzaNewYorkItaliana();
                break;
        }
        return producto;
    }
}
