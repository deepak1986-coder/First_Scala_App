package com.demo

import scala.collection.mutable.ArrayBuffer

object DemoHArray {
  def main(args: Array[String]): Unit = {
    var marks=ArrayBuffer[Int]()
    marks+=100
    marks+=200
    marks+=300
    marks+=400
    marks.foreach(println)
    marks+=23
    marks.foreach(println)
    marks.append(700)
    marks.foreach(println)
    marks++=Array(2,3,4,5,6,7)
    println("printing marks so for ")
    marks.foreach(print)
    println("Removing marks 5 from array of marks")
    marks-=5
    marks.foreach(println)

  }
}
