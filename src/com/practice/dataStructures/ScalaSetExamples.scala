package com.practice.dataStructures

object ScalaSetExamples {
  def main(args: Array[String]): Unit = {
    /**
     * Scala Set is a collection of pairwise different elements of the same type. In other words,
     * a Set is a collection that contains no duplicate elements. There are two kinds of Sets,
     * the immutable and the mutable. The difference between mutable and immutable objects is
     * that when an object is immutable, the object itself can't be changed.
     *
     * By default, Scala uses the immutable Set. If you want to use the mutable Set, you'll have
     * to import scala.collection.mutable.Set class explicitly. If you want to use both mutable
     * and immutable sets in the same collection, then you can continue to refer to the immutable
     * Set as Set but you can refer to the mutable Set as mutable.Set.
     *
     * Here is how you can declare immutable Sets −
     * // Empty set of integer type
     * var s : Set[Int] = Set()
     *
     * // Set of integer type
     * var s : Set[Int] = Set(1,3,5,7)
     *
     * or
     *
     * var s = Set(1,3,5,7)
     */
    val fruit = Set("apples", "oranges", "pears")
    val nums: Set[Int] = Set()

    println("Head of fruit : " + fruit.head)
    println("Tail of fruit : " + fruit.tail)
    println("Check if fruit is empty : " + fruit.isEmpty)
    println("Check if nums is empty : " + nums.isEmpty)

    /**
     * Concatenating Sets
     * You can use either ++ operator or Set.++() method to concatenate two or more sets, but
     * while adding sets it will remove duplicate elements.
     */
    val fruit1 = Set("apples", "oranges", "pears")
    val fruit2 = Set("mangoes", "banana")

    // use two or more sets with ++ as operator
    var fruits = fruit1 ++ fruit2
    println("fruit1 ++ fruit2 : " + fruits)

    // use two sets with ++ as method
    fruits = fruit1.++(fruit2)
    println("fruit1.++(fruit2) : " + fruits)

    /**
     * Find Max, Min Elements in a Set
     * You can use Set.min method to find out the minimum and Set.max method to find out the
     * maximum of the elements available in a set. Following is the example to show the program.
     */
    val num = Set(5, 6, 9, 20, 30, 45)

    // find min and max of the elements
    println("Min element in Set(5,6,9,20,30,45) : " + num.min)
    println("Max element in Set(5,6,9,20,30,45) : " + num.max)

    /**
     * Find Common Values Insets
     * You can use either Set.& method or Set.intersect method to find out the common values
     * between two sets. Try the following example to show the usage.
     */
    val num1 = Set(5, 6, 9, 20, 30, 45)
    val num2 = Set(50, 60, 9, 20, 35, 55)

    // find common elements between two sets
    println("num1.&(num2) : " + num1.&(num2))
    println("num1.intersect(num2) : " + num1.intersect(num2))
  }
}