package com.demo

object DemoCArray {
  def main(args: Array[String]): Unit = {
  println("heloo")
  var marks=Array(10,20,30,40,50)
  var avg=marks.reduceLeft((a,b) =>(a+b)/2)
  println("avg is "+avg)
    var avg2=marks.reduceLeft((a,b) =>{
      println("value of a is" +a+" and value of b is" +b+" average value is "+(a+b)/2)
      (a+b)/2
    })
    var totalMarks=marks.reduceLeft(_+_)
    println("total marks-"+totalMarks)
    //Short hand use
    var avg3=marks.reduceLeft(_/2+_/2)
    println("avg3 is "+avg3)
    var maxMarks=marks.reduceLeft(_ max _)
    println("maxMarks is "+maxMarks)
    var minMarks=marks.reduceLeft(_ min _)
    println("minMarks is "+minMarks)
  }
}
