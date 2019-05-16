package android.matrix.ooredoo.qa.problems.java;

import java.util.Arrays;

public class Anagram {

    static int anagram(String s){
        // Complete this function
        if(s.length() % 2 != 0) {
            return -1;
        }

        String firstPartStr = s.substring(0, (s.length() / 2));
        String secondPartStr = s.substring((s.length() / 2));

        char firstPartStrArr[] = firstPartStr.toCharArray();
        char secondPartStrArr[] = secondPartStr.toCharArray();

        Arrays.sort(firstPartStrArr);
        Arrays.sort(secondPartStrArr);

        //System.out.println(new String(firstPartStrArr));
        // System.out.println(new String(secondPartStrArr));

        int charsToChangeNum = 0;

        for(int i = 0; i < s.length()/2; i++) {
            if(firstPartStrArr[i] != secondPartStrArr[i]) {
                charsToChangeNum ++;
            }
        }

        return charsToChangeNum;

    }
}
