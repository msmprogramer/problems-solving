package android.matrix.ooredoo.qa.problems.java;

import java.util.HashSet;
import java.util.Set;

public class FindPalindromes {

    Set<String> palindromes = new HashSet<String>();
    int count = 0;
    for(int i=0; i<source.length()-1; i++) {
        for(int j= i+1; j<source.length(); j++) {
            String palindromeCandidate = new String(source.substring(i, j+1));
            if(isPalindrome(palindromeCandidate)) {
                palindromes.add(palindromeCandidate);
            }
        }
    }

    return palindromes.toArray(new String[palindromes.size()]);

    https://www.geeksforgeeks.org/find-number-distinct-palindromic-sub-strings-given-string/
    https://www.geeksforgeeks.org/count-special-palindromes-in-a-string/
}
