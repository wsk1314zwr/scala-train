package com.wsk.bigdata.scala.CompanionObject

object Timer {

  /**
    * 伴生对象（Object）与伴生类（Class）
    * 0）class A 与Object A，则前者是后者的伴生类，后者是前者的伴生对象
    * 1）调用属性方法和方法直接可通过 ObjectName.。它类似于java的static修饰属性和方法
    * 2)第一次调用Object会将{}中代码都执行一遍
    * 3)类名()=>调用的是Object.apply方法，同时会满足情况2，该apply一定是new 伴生类的对象返回
    * 4)对象/引用()=>调的是Class.apply方法
    */
  def main(args: Array[String]): Unit = {
    //调用Object对象的方法
    //    println(Timer.addCount)
    //    println(Timer.addCount)
    //    println(Timer.addCount)

    //Object对象中的代码执行顺序
    //    println(ApplyTest)
    //    for(i <- 1 to 10){
    //      ApplyTest.addCount()
    //    }
    //    println(ApplyTest.count)

    //new 一个对象
    //    val applyTest = new ApplyTest
    //    println(applyTest)
    //    applyTest.method()

    //object apply 方式创建对象
//    val test = ApplyTest()
//    test.method()
    //class appy方法调用
    val test2 = new ApplyTest()
    println(test2())
  }

  var count = 0;

  def addCount(): Int = {
    count += 1
    count
  }
}


object ApplyTest {
  println("enter ...")

  var count = 0

  def addCount() = {
    count += 1
    count
  }

  println("out ..........")

  def apply() = {
    println("object apply")
    new ApplyTest();
  }
}


class ApplyTest {

  def method(): Unit = {
    println("this is method function")
  }

  def apply() = {
    println("class apply")
  }
}