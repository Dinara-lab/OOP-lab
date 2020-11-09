package com.laboratories.opp.lab5;

public class J extends I{
    protected String j;
    public J(String j){
        super("i");
        this.j = j;
    }

    @Override
    public String toString() {
    return super.toString().replace("}", " j='" + j + "'}");

    }

}
