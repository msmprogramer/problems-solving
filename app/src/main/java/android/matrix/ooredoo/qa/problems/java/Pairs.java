package android.matrix.ooredoo.qa.problems.java;

public class Pairs {

    static int pairs(int k, int[] arr) {
        int numOfElementsPaira = 0;
        for(int i = 0; i< arr.length; i++) {
            for(int j = i+1; j < arr.length; j++ ) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    numOfElementsPaira ++;
                }
            }
        }

        return numOfElementsPaira;

    }
}
