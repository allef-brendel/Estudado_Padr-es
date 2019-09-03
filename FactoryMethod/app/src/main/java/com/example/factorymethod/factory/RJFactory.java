package com.example.factorymethod.factory;

import com.example.factorymethod.pojo.Massa;
import com.example.factorymethod.pojo.Molho;
import com.example.factorymethod.pojo.Queijo;
import com.example.factorymethod.pojo.Salsa;
import com.example.factorymethod.pojo_ingredientes.MassaGrossa;
import com.example.factorymethod.pojo_ingredientes.MolhoForte;
import com.example.factorymethod.pojo_ingredientes.QueijoQualho;
import com.example.factorymethod.pojo_ingredientes.SalsaApimentada;

public class RJFactory extends PizzaIngredientesFactory {
    @Override
    public Massa criarMassa() {
        return new MassaGrossa();
    }

    @Override
    public Queijo criarQueijo() {
        return new QueijoQualho();
    }

    @Override
    public Molho criarMolho() {
        return new MolhoForte();
    }

    @Override
    public Salsa criarSalsa() {
        return new SalsaApimentada();
    }
}
