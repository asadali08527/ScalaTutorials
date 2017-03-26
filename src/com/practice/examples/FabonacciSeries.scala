package com.practice.examples

class FabonacciSeries {
  def generate1(n: Int): Int = {
    if (n < 0) {
      throw new IllegalArgumentException(
        "Invalid Argument, n must be >= 0")
    }
    if (n == 0) 0
    else if (n == 1) 1
    else {
      var prev2 = 0
      var prev1 = 1
      var sum = 0
      for (i <- 2 to n) {
        sum = prev1 + prev2
        prev2 = prev1
        prev1 = sum
      }
      sum
    }
  }

  // recursive version
  def generate2(n: Int): Int = {
    if (n == 0) 0
    else if (n == 1) 1
    else {
      generate2(n - 2) + generate2(n - 1)
    }
  }
}

