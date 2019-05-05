package com.wsk.bigdata.scala.collection

object OptionTest {

  /**
    * Option[T]
    * 1)Option是抽象类，它的出现是为了解决java中返回null的问题。
    * 1）Option[T]是抽象类，子类SOME[T]表示取上值，NONE表示没有取到值
    */

  def main(args: Array[String]): Unit = {
    val map = Map("1"->2)
    val option1 = map.get("1")
    val option2 = map.get("2")
    println(option1)
    println(option1.get)
    println(option2)
  }
}
