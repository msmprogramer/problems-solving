package android.matrix.ooredoo.qa.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> numSet = new HashSet<>();
        for (int a:
                A) {
            numSet.add(a);
        }


        Arrays.sort(A);

        for (int i = A[0]; i < A[A.length-1]; i++) {
            if (!numSet.contains(i)) {
                return i;
            }
        }



        return 0;
    }

	import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        
        Arrays.sort(A);

        for (int i = A[0]; i < A[A.length-1]; i++) {
            
                if((A[i] + 1) != A[i + 1]) {
                    
                    return (A[i] + 1);
                }
        }
        
        return -1;
    }
}
  /*  long N = A.length + 1;
    long sum = N * (N + 1) / 2;
		for (int i = 0; i < A.length; i++) sum -= A[i];
		return (int) sum;*/
}
