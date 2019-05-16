package android.matrix.ooredoo.qa.problems.java;

import java.util.Arrays;
import java.util.HashSet;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
        // write your code in Java SE 8

        // write your code in Java SE 8
        HashSet<Integer> dups = new HashSet<Integer>();
        int elem = -1;

        for (int i = 0; i < A.length; i++) {
            if (dups.add(A[i])) {
                elem = A[i];
            }
        }
        return elem;
    }
}
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);

        int currentNumber = A[0];
        int elementNumber = 1;

        for(int i = 1; i < A.length; i++) {
            // System.out.println(A[i]);
            if(currentNumber == A[i]) {
                elementNumber ++;
            } else {
                //System.out.println(elementNumber);

                if (elementNumber % 2 != 0) {

                    return currentNumber;
                }

                currentNumber = A[i];
                elementNumber = 1;
            }
        }

        return currentNumber;
    }
}