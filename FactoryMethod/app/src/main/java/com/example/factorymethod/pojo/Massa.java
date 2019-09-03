package com.example.factorymethod.pojo;

import android.util.Log;

public class Massa {
    private static final String MASSA = "Massa ";
    public void MassaFina(){
        Log.e(MASSA, "Fina");
    }
    public void MassaGrossa(){
        Log.e(MASSA, "Grossa");
    }
}
