package com.laboratories.opp.lab5;

public class C extends B{
    protected String c;

    public C(String c){
        super("b");
        this.c = c;

    }
    @Override
    public String toString() {
        return super.toString().replace("}", " c='" + c + "'}");

    }
}
