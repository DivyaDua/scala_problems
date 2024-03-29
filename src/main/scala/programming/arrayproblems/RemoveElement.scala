package programming.arrayproblems

import scala.annotation.tailrec

object RemoveElement extends App {
    
    /**
     * Given an integer array nums and an integer ele, remove all occurrences of ele in nums in-place.
     * The order of the elements may be changed. Then return the number of elements in nums which are not equal to ele.
     *
     * Consider the number of elements in nums which are not equal to ele be k, to get accepted,
     * you need to do the following things:
     *
     * Change the array nums such that the first k elements of nums contain the elements which are not equal to ele.
     * The remaining elements of nums are not important as well as the size of nums.
     * Return k.
     *
     * @param nums Array of integer
     * @param ele  number to be removed
     * @return number of remaining elements
     */
    def removeElement(nums: Array[Int], ele: Int): Int = {
        def recursiveRemoveElement(list: List[Int]): List[Int] = {
            list match {
                case Nil => Nil
                case head :: Nil if head == ele => Nil
                case head :: tail if head != ele => head :: recursiveRemoveElement(tail)
                case head :: tail if head == ele => recursiveRemoveElement(tail)
                case _ => list
            }
        }
        
        val remainingNums = recursiveRemoveElement(nums.toList)
        println(remainingNums)
        remainingNums.length
    }
    
    def removeElementInPlace(nums: Array[Int], ele: Int): Int = {
        var count = 0
        val length = nums.length
        for (i <- 0 until length) {
            if (nums(i) != ele) {
                nums(count) = nums(i)
                count += 1
            }
        }
        println(nums.toList)
        count
    }
    
    println(removeElement(Array(3, 2, 2, 3), 3)) // 2
    println(removeElement(Array(0, 1, 2, 2, 3, 0, 4, 2), 2)) // 5
    
    println(removeElementInPlace(Array(3, 2, 2, 3), 3))
    println(removeElementInPlace(Array(0, 1, 2, 2, 3, 0, 4, 2), 2))
    
}
