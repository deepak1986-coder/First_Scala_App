package com.demo

object ForBArray {
  def main(args: Array[String]): Unit = {
    var marks1=Array(58,57,56,55,54,53,52,51,61,62,63,64)
    println("printing arrays via for loop from ForBArray")
    for (mark <-marks1){
      println(mark)
    }
    println("printing arrays via foreach loop")
    marks1.foreach(println)
    println("calculating total marks")
    var totalmarks=0
    var averageMarks=0
    marks1.foreach(totalmarks+=_)//added shroter hand
    println(" total marks is fromBArray "+totalmarks)
    averageMarks=totalmarks/marks1.length
    println(" average marks is fromBArray "+averageMarks)
    //unisg map also we can iterate but we will get multipe output
    //var newMarks=marks1.map(mark=>mark+10)
    var newMarks=marks1.map(_+10)//short hand notaions
    println("printing arrays via map loop")
    newMarks.foreach(println)
  }
}
