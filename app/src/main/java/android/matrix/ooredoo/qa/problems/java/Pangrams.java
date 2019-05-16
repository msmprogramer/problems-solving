package android.matrix.ooredoo.qa.problems.java;

import java.util.HashSet;
import java.util.Set;

public class Pangrams {

    static boolean isPangrams(String s) {
        //  System.out.println("lolo : "+ s);
        String strLowerCase = s.toLowerCase();
        for(char i = 'a'; i <= 'z' ; i++) {
            if(strLowerCase.indexOf(i) < 0) {
                return false;
            }
        }

        return true;
    }

    static boolean isPangramsFaster(String s) {
        String strLowerCase = s.toLowerCase();

        Set<Character> strSet = new HashSet<>();
        for(int i = 0; i < strLowerCase.length(); i++) {
            if(strLowerCase.charAt(i) == ' ') {
                continue;
            }
            strSet.add(strLowerCase.charAt(i));
        }

        //System.out.println("lolo : "+ strSet.size());

        if(strSet.size() == 26) {
            return true;
        }

        return false;

    }
}
