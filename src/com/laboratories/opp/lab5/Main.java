package com.laboratories.opp.lab5;
public class Main {
    public static void main(String[] args) {
        A object1 = new A("a",new X(""));
        B object2 = new B("b");
        C object3 = new C("c");
        D object4 = new D("d", new X(""));
        E object5 = new E("e");
        F object6 = new F("f");
        G object7 = new G("g");
        H object8 = new H("h");
        I object9 = new I("i");
        J object10 = new J("j");
        Object array [] = {object1,object2,object3,object4,object5,object6,object7,object8,object9,object10};
        for (int i = 0; i<array.length; i++){
            System.out.println(array[i]);

        }
    }
}