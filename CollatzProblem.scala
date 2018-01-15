package edu.knoldus

import org.apache.log4j.Logger

class CollatzProblem {

  val updatedList: List[Int] = List ()

  def collatzSolution (myInput: Int): List[Int] = {

    if (myInput == 1) {
      updatedList ::: List (myInput)
    }
    else if (myInput % 2 == 0) {
      updatedList ::: List (myInput) ::: collatzSolution (myInput / 2)
    }
    else {
      updatedList ::: List (myInput) ::: collatzSolution ((myInput * 3) + 1)
    }

  }

}

object Collatz {

  def main (args: Array[String]) {

    val log = Logger getLogger (this.getClass)
    val collatzObj = new CollatzProblem
    log.info ("Updated list is as Follows: ")
    val collatzInput = 15
    val collatzInput1 =37
    val newList = List (collatzObj.collatzSolution (collatzInput))
    val newList1 = List (collatzObj.collatzSolution (collatzInput1))
    newList.dropWhile(_ == newList1)
    log.info (newList ::: newList1)

  }
}





