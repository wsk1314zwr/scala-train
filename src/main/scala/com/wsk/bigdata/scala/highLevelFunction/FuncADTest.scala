package com.wsk.bigdata.scala.highLevelFunction

object FuncADTest {
  /**
    * 函数相关高级语法糖
    * 1）函数赋给变量
    * 2）匿名函数 ，语法：（参数名，参数类型）=>函数体， 注意这里的（）是不可以直接省略的
    * 3）函数curry，一个参数列表变成多个参数列表
    */

  def main(args: Array[String]): Unit = {


    //函数复制给变量
    val say = sayH _
    say("wsk")

    //匿名函数复制给变量
    val sum1 = (x:Int,y:Int)=>x+y
    println(sum1(1,2))
    val xfs = {x:Int=>0-x} //只有一个参数，且有花括号，则可以省略
    println(xfs(-9))

    //匿名函数复制给函数
    def sum2 = {(x:Int,y:Int)=>x+y}
    println(sum2(3,4))

  }

  def sayH(name: String): Unit ={
    println("你好"+name)
  }
}
