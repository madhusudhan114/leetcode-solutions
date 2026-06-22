package StackSolutions;

//Valid Parentheses (LeetCode #20)
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

import java.util.*;

public class ValidParanthesis {
    public static boolean validParanthesis(String s) {
        if(s == null || s.length() == 0 || s.length() == 1) {
            return false;
        }

        Stack<Character> charStack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '[' || c == '{' || c == '(') charStack.push(c);
            else {
                if(charStack.isEmpty()) return false;
                char top = charStack.pop();

                if(c == ']' && top != '[') {
                    return false;
                } else if (c == '}' && top != '{') {
                    return false;
                }  else if (c == ')' && top != '(') {
                    return false;
                }
            }
        }

        return charStack.isEmpty();
    };

    public static void main(String[] args) {
        String s = "[[{()}]]";
        boolean isValidParanthesis = validParanthesis(s);
        System.out.println(isValidParanthesis);
    }
}
