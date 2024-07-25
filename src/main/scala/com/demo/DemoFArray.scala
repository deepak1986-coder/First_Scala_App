package com.demo
import scala.Array._
object DemoFArray {
  def main(args: Array[String]): Unit = {
    var rollnum1=Array(2,3,4,5,6,7,8,9,10)
    var rollnum2=Array(1,2,3,4,5,6,7)
    var allRollNumbers=concat(rollnum1,rollnum2)
   allRollNumbers.foreach(println)
    //var marks=Array(0,1,2,3,4,5........100)
    println("Here is the range of 1 to 100")
    var marks=range(0,101)
    marks.foreach(println)
    println("Here is the number skipped bu 2")
    var marks2=range(2,101,2)
    marks2.foreach(println)
  }
}
