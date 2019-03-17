package android.matrix.ooredoo.qa.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PermCheck {

    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> numSet = new HashSet<>();
        for (int a:
                A) {
            if(!numSet.add(a)) {
                return 0;
            }
        }


        // permutation should be of size N
        if(numSet.size() != A.length) return 0;

        Arrays.sort(A);

        for (int i = A[0]; i < A[A.length-1]; i++) {
            if (!numSet.contains(i)) {
                return 0;
            }
        }

        return 1;
    }
}
