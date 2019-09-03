package com.example.factorymethod.factory;

import com.example.factorymethod.pojo.Massa;
import com.example.factorymethod.pojo.Molho;
import com.example.factorymethod.pojo.Queijo;
import com.example.factorymethod.pojo.Salsa;

public abstract class PizzaIngredientesFactory{
    public abstract Massa criarMassa();

    public abstract Queijo criarQueijo();

    public abstract Molho criarMolho();

    public abstract Salsa criarSalsa();
}
