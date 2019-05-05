package com.wsk.bigdata.scala

/**
  * partialfunction 偏函数
  * 1)语法 def funcName：PartialFunction[-A,+B]={case ... case...}
  * 2)-A表示输入类型为A类型或其父类型，+B表示输出为B类型或者其子类型
  * 3)偏函数功能和match很类似，可有使用偏函数实现模式匹配
  */
object PartialFuncTest {
  def main(args: Array[String]): Unit = {

    //调用模式匹配
    println(say("k"))
    println(say(""))

    //调用偏函数
    println(say2("s"))
    println(say2("w"))
  }

  //模式匹配
  def say(name: String):String= name match {
    case "s" => name +" is s"
    case "k" => name +" is k"
    case _ => name +" is unknow"
  }
  //偏函数
  def say2:PartialFunction[String,String]={
    case str if str=="s" =>str+ " is s"
    case str if str=="k" =>str+ " is k"
    case _ => " is unknow"
  }
}
