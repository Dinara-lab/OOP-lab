package com.laboratories.opp.lab3;
public class TextManipulation {
    public static void main(String[] args) {
       String input = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.";

        System.out.println("Number of words: " + Text.countWords(input));
        int vowelCount = 0;
        int consonantCount = 0;


        for (int i = 0; i<input.length();i++){
            if(Text.isVowel(input.charAt(i))){
             vowelCount++;
            }else if (!Text.isSymbol(input.charAt(i))){consonantCount++;}
        }
        System.out.println("Number of vowels: " + vowelCount + "\n" + "Number of consonants: " + consonantCount);
        System.out.println("The longest word is: " + Text.longestWord(input));
        System.out.println("Number of sentences: " + Text.numOfSentences(input));

    }
}
