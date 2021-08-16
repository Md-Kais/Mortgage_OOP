package com.comKais;

import java.text.NumberFormat;

public class Output {
    public void output(double value){
        System.out.println(NumberFormat.getCurrencyInstance().format(value));
    }

}
