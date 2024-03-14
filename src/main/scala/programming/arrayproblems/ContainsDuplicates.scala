package programming.arrayproblems

object ContainsDuplicates extends App {

    /**
     * Return true if array contains duplicate, else return false.
     */
    def containsDuplicate(nums: Array[Int]): Boolean = {
      nums.distinct.length != nums.length
    }

    println(containsDuplicate(Array(1, 2, 2)))
    println(containsDuplicate(Array(1, 2, 3)))
}
