package edu.knoldus

class Searching {

  def binarySearch(array: Array[Int], elem: Int): Boolean = {
    val right = array.length - 1
    val left = 0

    def iBinarySearch(arr: Array[Int], right: Int, left: Int, elem: Int): Boolean = {


      if (right >= left) {

        val middle: Int = left + (right - left) / 2
        if (arr(middle) == elem) {
          true
        }

        else if (arr(middle) < elem) {

          iBinarySearch(arr, middle + 1, right, elem)
        }
        else {
          iBinarySearch(arr, left, middle - 1, elem)
        }
      }
      else {
        false

      }



    }
    false
  }

  def linearSearch(array: Array[Int], elem: Int): Boolean = {
    for (position <- 0 until array.length) {
      if (elem == array(position))
        true
    }
    false

  }
}