package android.matrix.ooredoo.qa.problems;

public class DiagonalDifference {

    public static int diagonalDifference(int[][] arr) {

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0, j = arr.length - 1; i < arr.length; ++i, j--) {
            sum1 = sum1 + arr[i][i];
            sum2 = sum2 + arr[i][j];
        }

        return Math.abs(sum1 - sum2);
    }
}
