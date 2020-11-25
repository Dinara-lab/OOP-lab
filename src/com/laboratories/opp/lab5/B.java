package com.laboratories.opp.lab5;

public class B extends A{
    protected String b;

    public B (String b){
        super("a",new X("x"));
        this.b = b;
    }
    @Override
    public String toString() {
        return super.toString().replace("}", " b='" + b + "'}");

    }
}
