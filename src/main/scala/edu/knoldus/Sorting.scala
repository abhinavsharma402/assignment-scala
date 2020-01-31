package edu.knoldus

class Sorting {

  def insertionSort(array: Array[Int]): Array[Int] = {
    for(iterateArray<- 1 until array.length)
    {
      val compareElemnt=array(iterateArray)
     var j=iterateArray

      while(j>0&&array(j-1)>compareElemnt)
      {

        array(j)=array(j-1)

        j=j-1
      }
      array(j) = compareElemnt
    }
    array
  }

  def selectionSort(array: Array[Int]): Array[Int] = {

    for ( position<-0 until array.length)
    {

      val min_pos = position
      for (j<-min_pos+1 to array.length-1 )
      if (array(j) < array(min_pos)) {
        val min_pos = j
      }


       val temp = array(min_pos)
      array(min_pos) = array(position);
      array(position) = temp;

  }
    array
}

  def bubbleSort(array: Array[Int]): Array[Int] = {


    for (position <-0 until  array.length-1) {
      for (j <- 0 until array.length - position - 1) {
        if (array(j) > array(j + 1)) {

          val temp = array(j)
          array(j) = array(j + 1)
          array(j + 1) = temp
        }
      }
    }
          array
  }

}
