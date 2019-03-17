package android.matrix.ooredoo.qa.problems;

import java.util.HashSet;
import java.util.Set;

//missing number
public class MissingNumber {

    public int solution(int[] A) {
        int arrSize =  A.length;

        Set<Integer> set =  new HashSet<>();

        for (int number:
             A) {
            set.add(number);
        }

        for (int i = 1; i < arrSize + 1; i ++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return arrSize + 1;
    }
}
