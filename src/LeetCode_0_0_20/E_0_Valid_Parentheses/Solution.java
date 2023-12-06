package LeetCode_0_0_20.E_0_Valid_Parentheses;

import java.util.Stack;

class Solution {

    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        char[] myArray = s.toCharArray();

        for (char c : myArray) {
            if (c == '(' || c == '{' || c == '[') {
                myStack.push(c);
            } else {
                    if (myStack.isEmpty()){
                        return false;
                    }
                    char temp = myStack.pop();
                    if (c == ')' && temp == '(') {

                    } else if (c == '}' && temp == '{') {

                    } else if (c == ']' && temp == '[') {

                    } else {
                        return false;
                    }
                }
            }
        return myStack.isEmpty();
    }
}