package android.matrix.ooredoo.qa.problems.java;

public class TwoStrings {

    static String twoStrings(String s1, String s2) {

        for(int i =0; i < s2.length(); i++) {
            if(s1.indexOf(s2.charAt(i)) >= 0) {
                return "YES";
            }
        }

        return "NO";

    }
}
