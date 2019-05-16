package android.matrix.ooredoo.qa.problems.java;

import java.util.HashSet;
import java.util.Set;

public class StringConstruction {

    static int stringConstruction(String s) {

        Set<Character> strSet = new HashSet<>();

        for(int i = 0; i < s.length(); i++) {
            strSet.add(s.charAt(i));
        }

        return strSet.size();

    }
}
