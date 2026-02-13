package programming.arrayproblems

/**
 * Write a function to find the longest common PREFIX string amongst an array of strings.

    If there is no common prefix, return an empty string "".
 */

object LongestCommonPrefix extends App {
    
    def longestCommonPrefix(strs: Array[String]): String = {
        val minBy = strs.minBy(_.length).length
        strs
          .map(_.toList.take(minBy))
          .toList
          .transpose
          .takeWhile(lst => lst.forall(_ == lst.head))
          .map(_.head)
          .mkString
    }
    
    println(longestCommonPrefix(Array("flower","flow","flight")))
    println(longestCommonPrefix(Array("dog","racecar","car")))
    println(longestCommonPrefix(Array("ar","racecar","car")))
}
