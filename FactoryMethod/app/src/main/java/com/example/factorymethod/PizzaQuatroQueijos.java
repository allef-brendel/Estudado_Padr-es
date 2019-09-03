package com.example.factorymethod;

import com.example.factorymethod.factory.PizzaIngredientesFactory;
import com.example.factorymethod.pojo.Massa;
import com.example.factorymethod.pojo.Molho;
import com.example.factorymethod.pojo.Pizza;
import com.example.factorymethod.pojo.Queijo;
import com.example.factorymethod.pojo.Salsa;

public class PizzaQuatroQueijos extends Pizza {
    private PizzaIngredientesFactory ingredientes;

    public PizzaQuatroQueijos(PizzaIngredientesFactory ingredientes){
        this.ingredientes = ingredientes;
    }

    public void prepara(){
        Massa massa = ingredientes.criarMassa();
        Molho molho = ingredientes.criarMolho();
        Queijo queijo = ingredientes.criarQueijo();
        Salsa salsa = ingredientes.criarSalsa();
    }

}
