package programming.arrayproblems

import scala.annotation.tailrec

object Sum extends App {
    
    /**
     * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]
     * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
     *
     * Notice that the solution set must not contain duplicate triplets.
     *
     * @param nums Array of integers
     * @return List of triplets
     */
    def threeSum(nums: Array[Int]): List[List[Int]] = {
        val length = nums.length
        for (i <- 0 until length) {
            for (j <- i until length) {
                
            }
        }
        List()
    }
    
    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * You can return the answer in any order.
     *
     * @param nums   Array of integers
     * @param target target sum to find
     * @return array of indices of nums that sum up to target
     */
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        val length = nums.length
        for (i <- 0 until length) {
            for (j <- i + 1 until length) {
                if (nums(i) + nums(j) == target) {
                    return Array(i, j)
                }
            }
        }
        Array()
    }
    
    /**
     * Calculate total sum of the array.
     *
     * @param nums Array of integers
     * @return Total sum
     */
    def sum(nums: Array[Int]): Int = {
        @tailrec
        def recursiveSum(nums: List[Int], sum: Int = 0): Int = {
            nums match {
                case Nil => sum
                case head :: Nil => sum + head
                case head :: tail => recursiveSum(tail, sum + head)
            }
        }
        
        recursiveSum(nums.toList)
    }
    
    println(sum(Array(1, 2, 3)))
    
}
