package com.practice.examples

import scala.collection.mutable.LinkedHashMap
import scala.collection.immutable.HashMap

object Main {
  def main(args: Array[String]): Unit = {
    /*
     * Scala Arrays, an array in scala can be declared and initialized in following ways
     */
    // var z = new Array[String](3)
    // var z:Array[String] = new Array[String](3)
    // z(0) = "Zara"; z(1) = "Nuha"; z(4 / 2) = "Ayan"
    //println(z);
    var z = Array("Zara", "Hayat", "Khan")
    z.foreach(f => println(f))

    /**
     * Processing Arrays
     */
    var myList = Array(5.9, 7.9, 4.4, 6.5)

    // Print all the array elements
    for (x <- myList) {
      println(x)
    }

    // Summing all elements
    var total = 0.0;

    for (i <- 0 to (myList.length - 1)) {
      total += myList(i);
    }
    println("Total is " + total);

    // Finding the largest element
    var max = myList(0);

    for (i <- 1 to (myList.length - 1)) {
      if (myList(i) > max) max = myList(i);
    }

    println("Max is " + max);
   
    /**
     * Differences between map and flat map
     */
    println("*****************************************")
    val list = List("Asad", "Ali", "26", "Bangalore");
    println(list.map(_.toUpperCase())) // output List(ASAD, ALI, 26, BANGALORE)
    println(list.flatMap(_.toUpperCase())) //// output List(A, S, A, D, A, L, I, 2, 6, B, A, N, G, A, L, O, R, E)
    /**
     * How to print (Asad Ali , 26 , Gurgaon)
     */
    var myName = "Asad Ali"
    var myAge = 26
    var myCity = "Gurgaon"
    println("*****************************************")
    println(s"($myName , $myAge , $myCity)")
    //output (Asad Ali , 26 , Gurgaon)
    /*
     * String Rreverser
     */
    val stringReverser = new StringReverser
    println("*****************************************")
    println(stringReverser.reverse1("madA m'I madaM")) //Madam I'm Adam
    println(stringReverser.reverse2("madA m'I madaM")) //Madam I'm Adam
    println(stringReverser.reverse3("madA m'I madaM")) //Madam I'm Adam
    println(stringReverser.reverse4("madA m'I madaM")) //Madam I'm Adam
    /*
     * FabonacciSeries     * 
     */
    val fabonacci = new FabonacciSeries
    println("*****************************************")
    for (i <- 0 until 8) {
      print(fabonacci.generate1(i)) //011235813
    }
    println("\n Notice the differences in to and until");
    for (i <- 0 to 8) {
      print(fabonacci.generate1(i)) //01123581321
    }

    /*
     * 
     */
  }
}