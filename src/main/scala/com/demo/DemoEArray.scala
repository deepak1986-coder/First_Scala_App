//Multidimensional Array
package com.demo

import scala.Array._

object DemoEArray {
  def main(args: Array[String]): Unit = {
    var matrixEg=ofDim[Int](3,3)
    //println(matrixEg(0)(1))
    for(row<-0 to 2){
      for(column<-0 to 2){
        matrixEg(row)(column)= column+3
      }
    }
    for (row <- 0 to 2) {
      for (column <- 0 to 2) {
        print(matrixEg(row)(column))
      }
      println()
    }
  }
}
