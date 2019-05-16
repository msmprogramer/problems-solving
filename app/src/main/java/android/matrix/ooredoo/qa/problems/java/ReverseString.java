package android.matrix.ooredoo.qa.problems.java;

import java.util.Stack;

public class ReverseString {

    public static String reverse(String str) {
        char[] charArr = str.toCharArray();
        int size = charArr.length;
        Stack<Character> stack = new Stack<Character>();

        int i;
        for(i = 0; i < size; ++i) {
            stack.push(charArr[i]);
        }

        for(i = 0; i < size; ++i) {
            charArr[i] = stack.pop();
        }

        return String.valueOf(charArr);
    }
}
