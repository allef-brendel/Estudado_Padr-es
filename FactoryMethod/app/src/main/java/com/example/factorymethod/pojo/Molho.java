package com.example.factorymethod.pojo;

import android.util.Log;

public class Molho {
    private static final String MOLHO = "Molho ";
    public void molhoFraco(){
        Log.e(MOLHO, "Fraco");
    }
    public void molhoForte(){
        Log.e(MOLHO, "Forte");
    }
}
