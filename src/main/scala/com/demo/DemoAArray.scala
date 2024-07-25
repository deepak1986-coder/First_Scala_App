package com.demo

object DemoAArray {
def main(args: Array[String]): Unit =
{
  var marks=Array(58,57,56,55,54,53,52,51,61,62,63,64)
  for(mark<-marks){
    println(mark)
  }
  var totalmarks=0
  var avaerageMarks=0
  for(mark<-marks){
    totalmarks=totalmarks+mark
    println("Total marks is "+totalmarks)
  }
  avaerageMarks=totalmarks/marks.length
  println("Average marks is "+avaerageMarks)
  //finding average marks

}
}
