package com.practice.examples
/**
 * Implicit classes allow implicit conversations with class’s primary constructor when the
 * class is in scope. Implicit class is a class marked with ‘implicit’ keyword. This feature is
 * introduced in Scala 2.10.
 *
 *
 *
 */

object ImplicitClass {
  implicit class IntTimes(x: Int) {
    def times[A](f: => A): Unit = {
      def loop(current: Int): Unit =

        if (current > 0) {
          f
          loop(current - 1)
        }
      loop(x)
    }
  }
  def main(args: Array[String]): Unit = {
    4 times println("hello")
  }
  /**
   * In above example an implicit class named as IntTimes with the method times(). It means the 
   * times () contain a loop transaction that will execute the given statement in number of times 
   * that we give. Let us assume the given statement is “4 times println (“Hello”)” means 
   * the println (“”Hello”) statement will execute 4 times.
   *
   * 
   */
}