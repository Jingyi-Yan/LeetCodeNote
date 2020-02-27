package Leetcode;

import java.util.Stack;

public class ValidParentheses {
    /*
    Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    An input string is valid if:

    1.Open brackets must be closed by the same type of brackets.
    2.Open brackets must be closed in the correct order.
    3.Note that an empty string is also considered valid.

    * */
    private static boolean isValid(String s) {

        if (s == null || s.length() == 0) {
            return false;
        }
        // The java string toCharArray() method converts the given string into a sequence of characters.
        // The returned array length is equal to the length of the string.
        Stack<Character> stack = new Stack<>();
        for (Character ch : s.toCharArray()) {
            if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else if (ch == '(') {
                stack.push(')');
            } else {
                //
                if(stack.isEmpty()||stack.pop()!=ch){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
        public static void main(String[] args){

            ValidParentheses v1 = new ValidParentheses();
            ValidParentheses v2 = new ValidParentheses();
            boolean demo1 = v1.isValid("[]{}");
            boolean demo2 = v2.isValid("}}");

            System.out.println(demo1);
            System.out.println(demo2);

        }


}