package com.wsk.bigdata.scala.extend

object ExtendApp {
  def main(args: Array[String]): Unit = {

    //继承普通父类
    val tree = new BigTree("dashu", "shanghai", 1)
    tree.hello()
    println("-----------------------------------------------------")
    //继承抽象类
    val b = new B
    println(b.sleep())
    println("-----------------------------------------------------")
    //继承抽象类和tait
    val d = new D
    d.play()
    println(d.sleep())
    d.eat()

  }


}

/**
  * 继承
  * 普通父类、抽象父类（abstract）、trait（特质）
  * 1、子类继承父类，必须实现向父类主构造器传参
  * 2、父类的初始化是在子类之前
  * 3、子类重写父类的方法，必须添加override修饰符，
  * 4、子类重写var修饰的属性不用添加修饰符，重写val修饰的属性需要添加override修饰符
  * 5、抽象类中可以存在没有实现的方法和属性（无值），抽象类不能直接被new对象
  * 6、一个类只能继承一个父类
  * 7、trait和接口很类似一个类可以继承多个trait，
  * 8、继承tait语法 extend A| extend A with B ，注意若同时继承父类和trait，则extend后面必须是父类
  */
class BigTree(name: String, citys: String, money: Float)
  extends Peson(name, citys) {
  println("this is bigtree")

  override def hello(): Unit = {
    println("hello bigtree")
  }
}


class B extends A {
  override def sleep(): String = {
    "zzzz"
  }
}

abstract class A {
  def sleep(): String
}


class D extends A with C{
  override def play(): Unit ={
    println("D like play")
  }

  override def sleep(): String = {
    "D like sleep"
  }
}

trait  C  {
  def eat(): Unit ={
    println("I like eat")
  }

  def play():Unit
}
