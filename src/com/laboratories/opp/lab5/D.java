package com.laboratories.opp.lab5;

public class D extends C {
    protected String d;
    X x = new X("yyy");

    public D (String d, X value){
        super("c");
        this.d = d;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", " d='" + d + "' value:" + x.getValue()+ "}");

    }
}
