package com.example.factorymethod.pojo;

import android.util.Log;

public class Salsa {
    private static final String SALSA = "Salsa ";
    public void salsaApimentada(){
        Log.e(SALSA, "Apimentada");
    }
    public void salsaNaoApimentada(){
        Log.e(SALSA, "Não Apimentada");
    }
}
