package com.laboratories.opp.lab5;

public class H extends G{
    protected String h;
    private X x = new X("zzz");

    public H(String string){
        super("g");
        this.h = string;
    }
    @Override
    public String toString() {
        return super.toString().replace("}", " h='" + h +  "'" + " value:" + x.getValue() + "}");

    }
}
