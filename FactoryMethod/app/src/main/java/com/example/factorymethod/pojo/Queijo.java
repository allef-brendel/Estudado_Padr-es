package com.example.factorymethod.pojo;

import android.util.Log;

public class Queijo {
    private static final String QUEIJO = "Queijo ";
    public void queijoQualho(){
        Log.e(QUEIJO, "Qualho");
    }
    public void queijoManteiga(){
        Log.e(QUEIJO, "Manteiga");
    }
}
