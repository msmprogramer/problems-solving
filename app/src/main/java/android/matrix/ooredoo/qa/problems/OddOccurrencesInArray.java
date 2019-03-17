package android.matrix.ooredoo.qa.problems;

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
