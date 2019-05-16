package android.matrix.ooredoo.qa.problems.java

class TwoStrings {

    fun twoStrings(s1: String, s2: String): String {

        fun twoStrings(s1: String, s2: String): String {
            for (i in 0 until s2.length) {
                if (s1.indexOf(s2[i]) >= 0) {
                    return "YES"
                }
            }

            return "NO"

        }

    }
}