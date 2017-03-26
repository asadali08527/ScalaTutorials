package com.practice.examples
import scala.io._

class FileOperator {

  // the java way
  def computeSumOfValues1(file: String): Int = {
    var sum = 0
    var lno = 0
    for (line <- lines(file)) {
      lno = lno + 1
      try {
        sum += Integer.parseInt(chomp(line))
      } catch {
        case ex: NumberFormatException => {
          println("ERROR on line " + lno + ", " + chomp(line) +
            " not number")
        }
      }
    }
    sum
  }

  // the scala way
  def computeSumOfValues2(file: String): Int = {
    var sum = 0
    lines(file) foreach (sum += toNumber(_))
    sum
  }

  private def lines(file: String): Iterator[String] = {
    Source.fromFile(file).getLines
  }

  private def toNumber(s: String): Int = {
    try {
      Integer.parseInt(chomp(s))
    } catch {
      case ex: NumberFormatException => 0
    }
  }

  // maybe just simpler to use StringUtils.chomp()
  private def chomp(s: String): String = {
    try {
      if ((s.charAt(s.length - 1) == '\n') ||
        (s.charAt(s.length - 1) == '\r')) {
        s.substring(0, s.length - 1)
      } else if (s.substring(s.length - 2, s.length) == "\r\n") {
        s.substring(0, s.length - 2)
      } else {
        s
      }
    } catch {
      case ex: StringIndexOutOfBoundsException => s
    }
  }

}