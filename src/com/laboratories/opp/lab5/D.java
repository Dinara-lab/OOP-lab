package com.laboratories.opp.lab5;

public class D extends C {
    protected String d;
    X variable = new X("yyy");

    public D (String d, X value){
        super("c");
        this.d = d;
    }

    public X getValue(){
        return variable;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", " d='" + d + "' value:" + variable.getValue()+ "}");

    }
}
