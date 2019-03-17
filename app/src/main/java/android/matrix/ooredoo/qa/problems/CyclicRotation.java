package android.matrix.ooredoo.qa.problems;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        int [] outputArr = new int[A.length];

        for (int i = 0; i < A.length; i ++) {

            int newPos = 0;
            if ( (i + K) <= A.length -1) {
                newPos = i + K;
                outputArr [newPos]  = A[i];
            } else {
                newPos = Math.abs((i + K ) - A.length);
                outputArr [newPos]  = A[i];
            }

        }

        return outputArr;
    }

    public int[] solution2(int[] array, int k) {
        if (array == null)
            return null;

        int arrayLength = array.length;

        int[] sol = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            System.out.print((i + k) % arrayLength);

            sol[(i + k) % arrayLength] = array[i];
        }


        return sol;


    }

}
