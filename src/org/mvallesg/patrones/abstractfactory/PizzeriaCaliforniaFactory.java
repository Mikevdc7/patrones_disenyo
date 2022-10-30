package org.mvallesg.patrones.abstractfactory;

import org.mvallesg.patrones.abstractfactory.producto.PizzaCaliforniaPepperoni;
import org.mvallesg.patrones.abstractfactory.producto.PizzaCaliforniaQueso;
import org.mvallesg.patrones.abstractfactory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    public PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "queso":
                producto = new PizzaCaliforniaQueso();
                break;
            case "pepperoni":
                producto = new PizzaCaliforniaPepperoni();
                break;
            case "vegetariana":
                producto = new PizzaCaliforniaVegetariana();
                break;
        }
        return producto;
    }
}