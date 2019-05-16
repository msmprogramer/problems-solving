package android.matrix.ooredoo.qa.problems.java;

public class FrogJmp {

    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8

        if (X == Y)
            return 0;
        double totalDistance = Y -X;
        double steps = (totalDistance / D);
        return  (int) Math.ceil(steps);

    }
}
