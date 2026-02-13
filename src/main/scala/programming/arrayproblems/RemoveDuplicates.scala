package programming.arrayproblems

object RemoveDuplicates extends App {
    
    def removeDuplicates(nums: Array[Int]): Int = {
//        val deDupedArray = nums.map(x => (x, 1)).groupMapReduce(_._1)(_._2)(_ + _).keys.toArray
        val deDupedArray = nums.distinct.sorted
        deDupedArray.foreach(println)
        deDupedArray.length
    }
    
    def removeDuplicatesInPlace(nums: Array[Int]): Int = {
//        val deDupedArray = nums.distinct.sorted
//        val numberOfUniques = deDupedArray.length
//        nums.indices.foreach(i => if (i < numberOfUniques) nums(i) = deDupedArray(i))
//        nums.foreach(println)
//        numberOfUniques
    
        val numberOfUniques = nums.distinct.length
        nums.distinct.copyToArray(nums)
        numberOfUniques
    }
    
    removeDuplicates(Array(1, 1, 2))
    removeDuplicatesInPlace(Array(1, 1, 2))
}
