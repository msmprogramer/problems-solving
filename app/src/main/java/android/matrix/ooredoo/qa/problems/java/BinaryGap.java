package android.matrix.ooredoo.qa.problems.java;

public class BinaryGap {

    public int solution(int n) {
       String binaryumber =  Integer.toBinaryString(n);

       int gap = 0;
       int zeroCount = 0;

        for (char b:
             binaryumber.toCharArray()) {
            if (b == '1') {
                if (zeroCount > gap) {
                    gap =  zeroCount;
                }
                zeroCount = 0;
            } else {
                zeroCount ++;
            }
        }

        return gap;
    }
}
