package com.laboratories.opp.lab3;
import java.util.*;
import java.util.Map;

public class Text {
    public static int countWords(String string) {
        int wordCount = 1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ' &&
                    i < string.length() - 1 && string.charAt(i + 1) != ' ') {
                wordCount++;
            }
        }
        return wordCount;
    }

    public static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'U' || ch == 'O');
    }

    public static boolean isSymbol(char ch) {

        return (ch == '?' || ch == ';' || ch == ':' || ch == '!' || ch == '.' || ch == '(' || ch == ')'
                || ch == '{' || ch == '}' || ch == '[' || ch == ']' || ch == '"' || ch == ',' || ch == ' '
                || ch == '-');
    }

    public static String longestWord(String str) {
        String[] string = str.split(" ");
        String shortest = string[0];
        String longest = "";
        for (String s1 : string) {
            if (s1.length() < shortest.length()) {
                shortest = s1;
            } else if (s1.length() > longest.length()) {
                longest = s1;
            }
        }
        return longest;
    }

    public static int numOfSentences(String str) {
        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == '.' && j < str.length() - 1) {
                        if (str.charAt(j + 1) < 46 || str.charAt(j + 1) > 123) {
                            count++;
                        }
                    }
                }

          return count;

        }
        public static List<String> mostFrequentWord (String str,int topNumber){
            List<String> result = new ArrayList<>();
            String[] words = str.split("\\s+");
            Map<String, Integer> frequency = new HashMap<>();
            for (String word : words) {
                if (word == null || word.trim().equals(" ")) {
                    continue;
                }
                String processed = word.toLowerCase();
                if (frequency.containsKey(processed)) {
                    frequency.put(processed,
                            frequency.get(processed) + 1);
                } else {
                    frequency.put(processed, 1);
                }
            }
            List<Map.Entry<String, Integer>> list = new LinkedList<>(frequency.entrySet());
            Collections.sort(list, new Comparator<>() {
                public int compare(Map.Entry<String, Integer> x1, Map.Entry<String, Integer> x2) {
                    int x = x2.getValue() - x1.getValue();
                    if (x != 0) {
                        return x;
                    }
                    return x1.getKey().compareTo(x1.getKey());
                }
            });
            int index = 0;
            while (index < topNumber) {
                result.add(list.get(index).getKey());
                index++;
            }
            return result;
        }

    }














