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

     static int getPriority(char c) {
        if(c == '+' || c == '-') {
            return 1;
        } else {
            return 2;
        }
    }
    static String Postfix(String s){
         Stack<Character> st = new Stack<>();
         String postfix = "";
         char ch[] = s.toCharArray();
         char c;
         for(int i = 0; i < ch.length;i++) {
            c = ch[i];
            if(c != '+' && c != '-' && c != '*' && c != '/' && c != '(' && c != ')') {
                postfix = postfix + c;
            } else if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                while(!st.isEmpty()) {
                    char t = st.pop();
                    if(t != '(') {
                        postfix = postfix + t;
                    } else {
                        break;
                    }
                }
            } else if(c == '+' ||c == '-' ||c == '*' ||c == '/') {
                if (ch[i - 1] == '(' && c == '-') {
                  postfix = postfix + c + ch[i+1];
                  i+=2;
                } else if(st.isEmpty()) {
                    st.push(c);
                } else {
                    while(!st.isEmpty()) {
                        char t = st.pop();
                        if(t == '(') {
                            st.push(t);
                            break;
                        } else if(t == '+' || t == '-' || t == '*' || t == '/') {
                            if(getPriority(t) <  getPriority(c)) {
                                st.push(t);
                                break;
                            } else {
                                postfix = postfix + t;
                            }
                        }
                    }
                    st.push(c);
                }
            }
        }
        while(!st.isEmpty()) {
            postfix = postfix + st.pop();
        }
        return postfix;
    }

    static Integer postfixEvaluation(String s){
        Stack<Integer> st = new Stack<>();
        s = s.replaceAll(" ","");
        int x = 0, y = 0;
        char ch[] = s.toCharArray();
        char c;
        for(int i = 0; i < ch.length; i++) {
            c = ch[i];
            if(c >= '0' && c <= '9') {
                if (i > 2 && ch[i - 1] == '-' && ch[i - 2] == '(') {
                    st.push((int)(-1 * (c - '0')));
                }
                st.push((int)(c - '0'));
            } else {
                x = st.pop();
                if(st.isEmpty()){
                    return 1;
                }

                y = st.pop();
                switch(c) {
                    case '+':
                        st.push(x+y);
                        break;
                    case '-':
                        st.push(x-y);
                        break;
                    case '*':
                        st.push(x*y);
                        break;
                    case '/':
                        st.push(x/y);
                        break;
                }
            }
        }
        return st.pop();
    }
}







