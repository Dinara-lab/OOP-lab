package com.laboratories.opp.lab3;

  public class Text {

      public static int countWords(String str) {

          int wordCount = 1;
          for (int i = 0; i < str.length(); i++) {
              if (str.charAt(i) == ' ' &&
                      i < str.length() - 1 && str.charAt(i + 1) != ' ') {
                  wordCount++;
              }
          }
          return wordCount;
      }

      public static boolean isVowel(char ch) {
          ch = Character.toUpperCase(ch);
          return (ch =='A'|| ch=='E'|| ch == 'I' || ch=='U' || ch=='O');

      }
      public static boolean isSymbol(char ch) {

          return (ch =='?'|| ch==';'|| ch == ':' || ch=='!' || ch=='.' || ch =='(' || ch ==')'
                  || ch =='{' || ch =='}'|| ch =='[' || ch ==']' || ch =='"' || ch ==',');
      }

   public  static String longestWord(String str){
          String [] s =str.split(" ");
          String shortest = s[0];
          String longest = "";
          for (String s1 : s){
              if(s1.length()<shortest.length()){
                  shortest=s1;
              }else if (s1.length()>longest.length()){
                longest = s1;
              }
          }
          return longest;
   }
   public static int numOfSentences(String str){
          int count = 0;
          for(int i = 0; i < str.length(); i++) {
              if (str.charAt(i) == '.' && i < str.length() - 1) {
                  if (str.charAt(i + 1) < 46 || str.charAt(i + 1) > 123) {
                      count++;
                  }
              }
          }
          return count;
   }

  }




