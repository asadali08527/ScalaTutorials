package com.practice.dataStructures

object ScalaMaps {
  def main(args: Array[String]): Unit = {
    /**
     * Scala map is a collection of key/value pairs. Any value can be retrieved based on its key.
     * Keys are unique in the Map, but values need not be unique. Maps are also called Hash tables.
     * There are two kinds of Maps, the immutable and the mutable. The difference between mutable
     * and immutable objects is that when an object is immutable, the object itself can't be changed.
     *
     * By default, Scala uses the immutable Map. If you want to use the mutable Set, you'll have to
     * import scala.collection.mutable.Map class explicitly. If you want to use both mutable and
     * immutable Maps in the same, then you can continue to refer to the immutable Map as Map but
     * you can refer to the mutable set as mutable.Map.
     *
     * The Following is the example statements to declare immutable Maps −
     *
     * // Empty hash table whose keys are strings and values are integers:
     * var A:Map[Char,Int] = Map()
     *
     * // A map with keys and values.
     * val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")
     */

    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")

    val nums: Map[Int, Int] = Map()

    println("Keys in colors : " + colors.keys)
    println("Values in colors : " + colors.values)
    println("Check if colors is empty : " + colors.isEmpty)
    println("Check if nums is empty : " + nums.isEmpty)

    /**
     * Concatenating Maps
     * You can use either ++ operator or Map.++() method to concatenate two or more Maps,
     * but while adding Maps it will remove duplicate keys.
     *
     * Try the following example program to concatenate two Maps.
     */
    val colors1 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
    val colors2 = Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "#FF0000")

    // use two or more Maps with ++ as operator
    var colours = colors1 ++ colors2
    println("colors1 ++ colors2 : " + colours)

    // use two maps with ++ as method
    colours = colors1.++(colors2)
    println("colors1.++(colors2)) : " + colours)

    /**
     * Printing Keys and Values from a Map
     * You can iterate through the keys and values of a Map using “foreach” loop. Here,
     * we used method foreach associated with iterator to walk through the keys. Following is
     * the example program.
     */
    val colour = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")

    colour.keys.foreach { i =>
      print("Key = " + i)
      println(" Value = " + colour(i))
    }

    /**
     * Check for a key in Map
     * You can use either Map.contains method to test if a given key exists in the map or not.
     * Try the Following example program to key checking.
     */
    
    val color = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")

      if( color.contains( "red" )) {
         println("Red key exists with value :"  + color("red"))
      } else {
           println("Red key does not exist")
      }
      
      if( color.contains( "maroon" )) {
         println("Maroon key exists with value :"  + color("maroon"))
      } else {
         println("Maroon key does not exist")
      }
  }

}