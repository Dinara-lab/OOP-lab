package com.laboratories.opp.lab4;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException, ScriptException {
        File file = new File("/Users/buciladinara/IdeaProjects/OOP-labs/src/com/laboratories/opp/lab4/one_expression");
        Scanner scanner = new Scanner(file);
        String s1 = scanner.nextLine();
        System.out.println(Expression.isValid(s1));
        File file1 = new File("/Users/buciladinara/IdeaProjects/OOP-labs/src/com/laboratories/opp/lab4/three_expressions");
        scanner.close();

        int counter = 0;
        BufferedReader br = new BufferedReader(new FileReader(file1));
        String line;
        while ((line = br.readLine()) != null) {
            counter++;
            switch(counter){
                case 1:
                    System.out.println(Expression.isValid(line));
                    break;
                case 2:
                    System.out.println(Expression.isValid(line));
                    break;
                case 3:
                    System.out.println(Expression.isValid(line));
                    break;
                default:
                    System.out.println("false");
                    break;
            }
        }
        br.close();
        if (Expression.isValid(s1)){
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            Object result = engine.eval(s1);
            System.out.println("Rezultatul expresiei este: " + result);
        }

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        Object result_1 = engine.eval("25 / (2+5)*12 - ((29*4-2) + 32) -14");
        System.out.println("Rezultatul expresiei este: (2x-3y)" + result_1);

    }


}
