package android.matrix.ooredoo.qa.problems;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {

        Arrays.sort(arr);

        int minSum = 0;
        int maxSum = 0;


        for (int i = 0, j = arr.length - 1; i < 4; ++i, j--) {
            minSum = minSum + arr[i];
            maxSum = maxSum + arr[j];
        }

        System.out.print(minSum);
        System.out.print(" ");
        System.out.print(maxSum);

    }

    static void miniMaxSum2(int[] arr) {

        Set<Integer> set = new TreeSet<>();
        for

    }
