package com.wsk.bigdata.scala

object StringTest {
  def main(args: Array[String]): Unit = {

    val name = "wsk"

    /**
      * 字符串
      * 1.常使用s加${}方式进行拼接字符串（字符串插值），而不是+符号
      * 2.多行字符串可以""""""加|方式输出
      */

    //不推荐
    println("name is "+name)
    //推荐
    println(s"name is $name")
    //多行字符串
    val lins=
      s"""
        |欢迎来到wsk的工作空间
        |hell，$name like study Scala
        |good good study day day up
      """.stripMargin
    println(lins)
  }
}
