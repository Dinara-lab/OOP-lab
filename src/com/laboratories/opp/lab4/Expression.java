package com.laboratories.opp.lab4;
import java.util.Stack;
public class Expression {

    static boolean isValid(String s) {
         Stack<Character> stack = new Stack();
         for (char c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '['){
                 stack.push(c);
             }else if (c == ')' && !stack.isEmpty() && stack.peek() == '('){
                 stack.pop();
             }else if (c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                 stack.pop();
             }else if (c == ']' && !stack.isEmpty() && stack.peek() == '['){
                 stack.pop();
             }else if (c ==')' && stack.isEmpty()){
                 return  false;
             }
         }
         return stack.isEmpty();
     }
}







