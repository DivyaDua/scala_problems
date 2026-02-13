package programming.stringproblems

/**
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 */
object firstOccurrence extends App {
    
    def strStr(haystack: String, needle: String): Int = {
        haystack.indexOf(needle)
    }
    
    println(strStr("sadbutsad", "sad"))
    println(strStr("leetcode", "leeto"))
    println(strStr("sabutsadsad", "sad"))
}
