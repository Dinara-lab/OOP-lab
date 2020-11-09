package com.laboratories.opp.lab4;
import java.io.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/buciladinara/IdeaProjects/OOP-labs/src/com/laboratories/opp/lab4/one_expression");
        Scanner scanner = new Scanner(file);
        String s1 = scanner.nextLine();
        File file1 = new File("/Users/buciladinara/IdeaProjects/OOP-labs/src/com/laboratories/opp/lab4/three_expressions");
        System.out.println(Expression.isValid(s1));
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
    }
}
