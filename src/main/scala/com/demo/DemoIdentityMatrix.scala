package com.demo

import scala.Array._

object DemoIdentityMatrix {
  def main(args: Array[String]): Unit = {
    var matrixEg=ofDim[Int](5,5)
    for(row<-0 to 4){
      for(col<-0 to 4){
        if(row==col){
          matrixEg(row)(col)=1
        }
        else{
          matrixEg(row)(col)=0
        }
      }
    }
    for(row<-0 to 4){
      for(col<-0 to 4){
        print(matrixEg(row)(col))
      }
      println()
    }
  }
}
