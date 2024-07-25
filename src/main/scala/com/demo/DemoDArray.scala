package com.demo

object DemoDArray {
  def main(args: Array[String]): Unit = {
  println("heloo")
  var zmarks=Array(10,20,30,40,50,60)
  var zavg=zmarks.reduceRight((a,b) =>(a+b)/2)
  println("zavg is "+zavg)
    var zavg2=zmarks.reduceRight((a,b) =>{
      println("value of a is" +a+" and value of b is" +b+" average value is "+(a+b)/2)
      (a+b)/2
    })
    var ztotalMarks=zmarks.reduceRight(_+_)
    println("total marks-"+ztotalMarks)
    //Short hand use
    var avg3=zmarks.reduceRight(_/2+_/2)
    println("zavg3 is "+avg3)
    var zmaxMarks=zmarks.reduceRight(_ max _)
    println("zmaxMarks is "+zmaxMarks)
    var zminMarks=zmarks.reduceRight(_ min _)
    println("zminMarks is "+zminMarks)
  }
}
