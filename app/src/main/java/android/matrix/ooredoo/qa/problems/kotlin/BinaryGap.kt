package android.matrix.ooredoo.qa.problems.kotlin
class BinaryGap {

    fun solution(n: Int): Int {

        val binaryumber : String = Integer.toBinaryString(n)

        var gap = 0
        var zeroCount = 0

        var b1: String = "apple"


        for (b in binaryumber) {
            if (b == '1') {
                if (zeroCount > gap) {
                    gap = zeroCount
                }
                zeroCount = 0
            } else {
                zeroCount++
            }
        }

        return gap
    }
}
