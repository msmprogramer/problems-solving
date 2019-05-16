package android.matrix.ooredoo.qa.problems.java;

import java.util.Arrays;

public class PermutingTwoArrays {

    static String twoArrays(int k, int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0, j = A.length -1; i < A.length; i++, j--) {
            if((A[i] + B[j]) < k) {
                return "NO";
            }
        }

        return "YES";

    }

}
