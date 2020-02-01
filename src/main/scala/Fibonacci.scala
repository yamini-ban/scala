package edu.knoldus

class Fibonacci {

  def calculateNextElement(startFrom: Int, limit: Int, array: Array[Int]): Array[Int] = {
    if (startFrom > limit) {
      array
    }
    else {
      array(1) = 1
      array(startFrom - 1) = array(startFrom - 2) + array(startFrom - 3)
      calculateNextElement(startFrom + 1, limit, array)
    }

  }

  def fibonacciSeries(limit: Int):Array[Int] = {
    if (limit <= 1) {
      Array(0)
    } else if (limit == 2) {
      Array(0, 1)
    } else calculateNextElement(3, limit, new Array[Int](limit): Array[Int])
  }

}
