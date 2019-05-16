package android.matrix.ooredoo.qa.problems.java;

public class SparseArrays {

    static int[] matchingStrings(String[] strings, String[] queries) {

        int[] outArr = new int[queries.length];

        int count = 0;
        for(int i = 0; i < queries.length; i++) {
            for(int j = 0; j < strings.length; j++) {
                if(queries[i].equals(strings[j])) {
                    count++;
                }
            }
            outArr[i] = count;
            count = 0;
        }

        return outArr;


    }
}
