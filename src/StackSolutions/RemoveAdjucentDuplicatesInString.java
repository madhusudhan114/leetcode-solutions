package StackSolutions;

import java.util.Stack;

//3. Remove All Adjacent Duplicates In String (LeetCode #1047)
//The Problem: Given a string, repeatedly remove adjacent duplicate characters until no more duplicates remain (e.g., "abbaca" $\rightarrow$ "aaca" $\rightarrow$ "ca").
public class RemoveAdjucentDuplicatesInString {

    public static String removeDuplicates(String s) {
        Stack<Character> stringStack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(stringStack.isEmpty()) {
                stringStack.push(c);
            } else if(c == stringStack.peek()) {
                stringStack.pop();
            } else {
                stringStack.push(c);
            }
        }

        StringBuilder output = new StringBuilder();
        while(!stringStack.isEmpty()) {
            output.append(stringStack.pop());
        }

        return output.reverse().toString();
    }
    public static void main(String[] args) {
        RemoveAdjucentDuplicatesInString removeAdjucentDuplicatesInString = new RemoveAdjucentDuplicatesInString();
        String output = removeAdjucentDuplicatesInString.removeDuplicates("abbaca");
        System.out.println(output);
    }

}
