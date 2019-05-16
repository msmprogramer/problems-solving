package android.matrix.ooredoo.qa.problems.kotlin

import java.util.*

object ReverseString {

    fun reverse(str: String): String {

        val stack = Stack<Char>()
        val sb  = StringBuilder()

        var i = 0
        while (i < str.length) {
            stack.push(str[i])
            ++i
        }

        i = 0
        while (i < str.length) {
            sb.append(stack.pop())
            ++i
        }

        return sb.toString();
    }
}
