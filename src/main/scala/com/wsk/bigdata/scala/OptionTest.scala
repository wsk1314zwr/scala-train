package com.wsk.bigdata.scala

/**
  *大多数语言都有一个特殊的关键字或者对象来表示一个对象引用的是“无”,java null、 scala none
  *
  * Option 表示可选值 若返回 Some（T） 表示有值 值为T，返回 none 表示无值。但是 none 是个对象不同于java的null 关键字
  */
object OptionTest {

  def main(args: Array[String]): Unit = {

    val capitals = Map("France"->"Paris", "Japan"->1, "China"->"Beijing")
    val maybeString = capitals.get("France")
    val maybeString2 = capitals.get("China")
    val option = capitals.get("Japan")
    println("测试：打印输出1:"+maybeString.get.toString())
    println("测试：打印输出2:"+maybeString2.getOrElse())
    println("测试：打印输出2:"+option.toString())

    println(String.format("测试：打印输出Optin以及模式匹配，%s",optionTest(Some("1")).toString))

  }

  def optionTest(x: Option[String]):Int={
    x match {
      case Some(z) =>1
      case none => 0

    }
  }


}
