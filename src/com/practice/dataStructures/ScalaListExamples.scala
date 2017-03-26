package com.practice.dataStructures;
/**
 * Scala Lists are quite similar to arrays which means, all the elements of a list have the
 * same type but there are two important differences. First, lists are immutable, which means
 * elements of a list cannot be changed by assignment. Second, lists represent a linked list
 * whereas arrays are flat.
 *
 * The type of a list that has elements of type T is written as List[T].
 */
object ScalaListExamples {
  def main(args: Array[String]) {
    // List of Strings
    val fruit: List[String] = List("apples", "oranges", "pears")

    // List of Integers
    val nums: List[Int] = List(1, 2, 3, 4)

    // Empty List.
    val emptyList: List[Nothing] = List()

    // Two dimensional list
    val dim: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1))

    /**
     * All lists can be defined using two fundamental building blocks, a tail Nil and ::,
     * which is pronounced cons. Nil also represents the empty list. All the above lists can
     * be defined as follows.
     */

    // List of Strings
    val fruites = "apples" :: ("oranges" :: ("pears" :: Nil))

    // List of Integers
    val numbers = 1 :: (2 :: (3 :: (4 :: Nil)))

    // Empty List.
    val empty = Nil

    // Two dimensional list
    val twoDList = (1 :: (0 :: (0 :: Nil))) ::
      (0 :: (1 :: (0 :: Nil))) ::
      (0 :: (0 :: (1 :: Nil))) :: Nil

    println("Head of fruit : " + fruit.head)
    println("Tail of fruit : " + fruit.tail)
    println("Check if fruit is empty : " + fruit.isEmpty)
    println("Check if nums is empty : " + nums.isEmpty)

    /**
     * Concatenating Lists
     * You can use either ::: operator or List.:::() method or List.concat() method to add two or
     * more lists. Please find the following example given below −
     */
    val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val fruit2 = "mangoes" :: ("banana" :: Nil)

    // use two or more lists with ::: operator
    var fruits = fruit1 ::: fruit2
    println("fruit1 ::: fruit2 : " + fruits)

    // use two lists with Set.:::() method
    fruits = fruit1.:::(fruit2)
    println("fruit1.:::(fruit2) : " + fruits)

    // pass two or more lists as arguments
    fruits = List.concat(fruit1, fruit2)
    println("List.concat(fruit1, fruit2) : " + fruits)

    /**
     * Creating Uniform Lists
     * You can use List.fill() method creates a list consisting of zero or more copies of the
     * same element. Try the following example program.
     */
    val _fruit = List.fill(3)("apples") // Repeats apples three times.
    println("fruit : " + _fruit)

    val _num = List.fill(10)(2) // Repeats 2, 10 times.
    println("num : " + _num)

    /**
     *  Tabulating a Function
     *  You can use a function along with List.tabulate() method to apply on all the elements of
     *  the list before tabulating the list. Its arguments are just like those of List.fill: the
     *  first argument list gives the dimensions of the list to create, and the second describes
     *  the elements of the list. The only difference is that instead of the elements being fixed,
     *  they are computed from a function.
     *
     *  Try the following example program.
     */
    // Creates 5 elements using the given function.
    val squares = List.tabulate(6)(n => n * n)
    println("squares : " + squares)

    val mul = List.tabulate(4, 5)(_ * _)
    println("mul : " + mul)

    /**
     * Reverse List Order
     * You can use List.reverse method to reverse all elements of the list.
     * The Following example shows the usage.
     */
    println("Before reverse fruit : " + fruit)
    println("After reverse fruit : " + fruit.reverse)
  }
}