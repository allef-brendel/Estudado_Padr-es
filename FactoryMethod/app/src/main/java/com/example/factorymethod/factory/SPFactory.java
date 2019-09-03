package com.example.factorymethod.factory;

import com.example.factorymethod.pojo.Massa;
import com.example.factorymethod.pojo.Molho;
import com.example.factorymethod.pojo.Queijo;
import com.example.factorymethod.pojo.Salsa;
import com.example.factorymethod.pojo_ingredientes.MassaFina;
import com.example.factorymethod.pojo_ingredientes.MolhoFraco;
import com.example.factorymethod.pojo_ingredientes.QueijoManteiga;
import com.example.factorymethod.pojo_ingredientes.SalsaNaoApimentada;

public class SPFactory extends PizzaIngredientesFactory{

    @Override
    public Massa criarMassa() {
        return new MassaFina();
    }

    @Override
    public Queijo criarQueijo() {
        return new QueijoManteiga();
    }

    @Override
    public Molho criarMolho() {
        return new MolhoFraco();
    }

    @Override
    public Salsa criarSalsa() {
        return new SalsaNaoApimentada();
    }
}
