package com.laboratories.opp.lab5;

public class E extends D {
    protected String e;
    public E (String e){
        super("d",new X(""));
        this.e = e;
    }
    @Override
    public String toString() {
        return super.toString().replace("}", " e='" + e + "'}");
    }
}
