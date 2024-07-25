package com.demo

object DemoGArray {
  def main(args: Array[String]): Unit = {
    var mark1=Array(5,6,7)
    var mark2=Array(5,8,9)
    var mark3=Array(5,1,6)
    var marks=Array(mark1,mark2,mark3)
    for(marka<-marks){
      for(markb<-marka){
        print(markb)
      }
      println("")
    }
  }
}
