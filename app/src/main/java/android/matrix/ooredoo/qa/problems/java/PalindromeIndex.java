package android.matrix.ooredoo.qa.problems.java;

public class PalindromeIndex {

    static int palindromeIndex(String s) {

        if (isPlaindrome(s)) {
            return -1;
        }

        for(int i = 0; i < s.length(); i ++) {

            String newStr = s.substring(0, i) + s.substring(i +1);
            if (isPlaindrome(newStr)) {
                return i;
            }
        }

        return -1;

    }

    static boolean isPlaindrome(String s) {
        // return new StringBuilder(s).reverse().toString().equals(s);
        for(int i= 0, j = s.length()-1; i < j; i++ , j--) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}
