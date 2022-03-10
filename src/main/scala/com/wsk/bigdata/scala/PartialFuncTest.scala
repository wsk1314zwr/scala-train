package com.wsk.bigdata.scala
import com.wsk.bigdata.scala.ObjectOriented.People
import com.wsk.bigdata.scala.extend.C
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
    println(this say2 "s") //方法调用如果以空白替换逗号，那么后面方法参数小括号可以舍去
    println(say2("w"))
    println(say(new People222))
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

  class People222 extends People with C {
    override def play(): Unit = {
      println("C like play")
    }
  }
  //模式匹配
  def say(p: People): String = p match {
    case _: C => p + " is k"  //可以写父类型，也可以写和传入类型毫无关系的trait，当people子类实现了C特质，则可以匹配到
//    case People => p + " is s" //此写法在scala2.12中的语法是错误的，因换成下面的
    case _: People => p + " is s"
    case _ => p + " is unknow"
  }
}
