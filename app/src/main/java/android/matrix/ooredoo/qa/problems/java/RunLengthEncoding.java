package android.matrix.ooredoo.qa.problems.java;

public class RunLengthEncoding {

    public String solution(char[] A) {

        StringBuilder stringBuilder = new StringBuilder();
        int runLength = 1;
        char lastChar = A[0];
        for (char d : A) {
            if (d == lastChar) {
                runLength ++;
                lastChar = d;
            } else {
                stringBuilder.append(lastChar);
                stringBuilder.append(runLength);
                runLength = 1;
                lastChar = d;
            }
        }

        return stringBuilder.toString();

    }

    }
