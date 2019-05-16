package android.matrix.ooredoo.qa.problems.java;

import java.util.Arrays;

public class SherlockValidString {

    static String isValid(String s) {

        char [] strArr = s.toCharArray();
        Arrays.sort(strArr);
        System.out.println(new String(strArr));
        int charCount = 0;
        int lastCharsCount = 0;
        char tempChar = strArr[0];
        boolean oneTimeRemove = false;

        for(int i = 0; i < strArr.length; i+=2) {
            if(tempChar == strArr[i]) {
                charCount ++;
            } else {
                if (lastCharsCount != charCount) {
                    if(oneTimeRemove) {
                        return "NO";
                    } else {
                        charCount --;
                        oneTimeRemove = true;
                        if (lastCharsCount != charCount){
                            return "NO";
                        }

                    }

                }

                lastCharsCount = charCount;
                charCount = 1;
                tempChar = strArr[i];
            }
        }

        return "YES";
    }
}
