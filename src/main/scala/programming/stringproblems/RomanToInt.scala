package programming.stringproblems

object RomanToInt extends App {

    val romansMap: Map[Char, Int] = Map('I' -> 1, 'V' -> 5, 'X' -> 10, 'L' -> 50, 'C' -> 100, 'D' -> 500, 'M' -> 1000)
    val romansTupleMap: Map[String, Int] = Map("IV" -> 4, "IX" -> 9, "XL" -> 40, "XC" -> 90, "CD" -> 400, "CM" -> 900)

    /**
     * Given a roman numeral, convert it to an integer.
     *
     * @param s roman numeral
     * @return number corresponding to roman numeral
     */
    def romanToInt(s: String): Int = s match {
      case "" => 0
      case _ if romansTupleMap.contains(s.take(2)) => romanToInt(s.drop(2)) + romansTupleMap(s.take(2))
      case _ => romanToInt(s.tail) + romansMap(s.head)
    }

    println(romanToInt("III")) // 3
    println(romanToInt("LVIII")) // 58
    println(romanToInt("MCMXCIV")) // 1994

}
