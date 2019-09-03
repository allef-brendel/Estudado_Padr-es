package com.example.factorymethod;

import com.example.factorymethod.factory.PizzaIngredientesFactory;
import com.example.factorymethod.factory.RJFactory;
import com.example.factorymethod.factory.SPFactory;
import com.example.factorymethod.pojo.Pizza;

public class Pizzaria {
    private Pizza pizza;

    public void criarPizza(String cidade, String tipo){
        if(tipo.equals("queijo")){
            pizza = new PizzaQuatroQueijos(getIngredientes(cidade));
        }
    }
    public PizzaIngredientesFactory getIngredientes(String cidade){
        if(cidade.equals("sao-paulo")) {
            return new SPFactory();
        }
        return new RJFactory();
        }
}
