package com.laboratories.opp.lab5;

public class F extends E {
    protected String f;
    public F (String f){
        super("e");
        this.f = f;
    }
    @Override
    public String toString() {
        return super.toString().replace("}", " f='" + f + "'}");

    }
}
