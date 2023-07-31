package org.practice;

import java.util.Stack;

public class StringHelper {
    private static StringHelper stringHelperInstance = new StringHelper();
    private StringHelper(){}

    public static StringHelper getStringHelperInstance(){
        return stringHelperInstance;
    }
    public String reverseString(String input){
        if(input != null){
            Stack<Character> stack = new Stack<>();
            for(char letter : input.toCharArray()){
                stack.add(letter);
            }
            StringBuilder stringBuilder = new StringBuilder();
            while(!stack.empty()){
                stringBuilder.append(stack.pop());
            }
            return stringBuilder.toString();
        }
        return "";
    }

    public String reverseStringType2(String input){
        if(input != null){
            char[] letters = input.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            for(int index = letters.length; index > 0; index--){
                stringBuilder.append(letters[index - 1]);
            }
            return stringBuilder.toString();
        }
        return "";
    }

    public boolean findVowels(String input){
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
