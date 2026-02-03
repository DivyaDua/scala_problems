package programming.stringproblems

import scala.collection.mutable
import scala.util.control.Breaks.break


object FinalMessage extends App {
    
    def solution(s: String): String = {
        val c: Char = s(0)
        if (c.isUpper) {
            "upper"
        } else if (c.isLower) {
            "lower"
        } else if (c.isDigit) {
            "digit"
        } else {
            "other"
        }
    }
    
    println(solution("Abc"))
    println(solution("1bc"))
    println(solution("abc"))
    println(solution("!abc"))
    
    /**
     * There are N persons named from 0 to N-1. 0th person sends a message S[0] to A[0] say K person, and then Kth person
     * send message to A[K] person by appending S[K] to the last message and so on, until the message reaches back
     * to 0th person. Find the final message.
     *
     * @param s string
     * @param a array of persons
     * @return
     */
    def solution1(s: String, a: Array[Int]): String = {
        val length = a.length
        var i: Int = 0
        var str = ""
        while (i < length) {
            str += s.charAt(i).toString
            if (a(i) == 0) {
                return str
            } else {
                i = a(i)
            }
        }
        str
    }
    
    println(solution1("cdeo", Array(3, 2, 0, 1)))
    println(solution1("cdeenetpi", Array(5, 2, 0, 1, 6, 4, 8, 3, 7)))
    println(solution1("bytdag", Array(4, 3, 0, 1, 2, 5)))
}
