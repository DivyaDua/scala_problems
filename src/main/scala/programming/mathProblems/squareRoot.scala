package programming.mathProblems

import scala.annotation.tailrec

/**
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
 * The returned integer should be non-negative as well.
 * You must not use any built-in exponent function or operator.
 *
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 */

object squareRoot extends App {
    // We will use binary search in this case
    def mySqrt(x: Int): Int = {
        @tailrec
        def helper(left: Int, right: Int): Int = {
            val mid = left + (right - left) / 2
            val guess = mid.toLong * mid
            mid match {
                case _ if left > right => right
                case _ if x == guess => mid
                case _ if x > guess => helper(mid + 1, right)
                case _ => helper(left, mid - 1)
            }
        }
        if (x < 2) x else helper(2, x / 2)
    }
    
    println(mySqrt(4))
    println(mySqrt(8))
    println(mySqrt(16))
    println(mySqrt(49))
    println(mySqrt(2147395599))
}
