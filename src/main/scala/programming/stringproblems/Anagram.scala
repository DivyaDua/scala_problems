package programming.stringproblems

object Anagram extends App {

    /**
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
     * typically using all the original letters exactly once.
     */
    def isAnagram(s: String, t: String): Boolean = {
      t.length == s.length & t.forall(s.contains(_))
    }

    println(isAnagram("abca", "baca"))
    println(isAnagram("abca", "bac"))

}
