package com.wsk.bigdata.scala

object ConStructTest {

  def main(args: Array[String]): Unit = {

    val people = new People
    println("-------------------------------------------------------------------")
    val wsk = new People2("wsk", "hefei")
    println("-------------------------------------------------------------------")
    val wsk2 = new People3("wsk", "hefei", 5)
    println("-------------------------------------------------------------------")

  }
}

/**
  * 1.所有的类都有主构造器，主构造器在类名后面 创建对象时一定是先走主构造器
  * 2.走主构造器的特点就是执行花括号中的代码
  */
class People {
  println("你好")
}

/**
  *3.属性可以写在类名后面
  */
class People2(name: String, city: String) {
  println(name + ":" + city)
}

/**
  *4.附属构造器可以是多个，即使通过附属构造器构造对象，但是代码的第一行必须先走主构造器再走其它附属构造器,
  */
class People3(name: String, city: String) {

  var age: Int = _
  println("此时的age为，主" + age)

  def this(name: String, city: String, age: Int) {
    this(name, city)
    this.age = age
    println("此时的age为，附属" + age)

  }
}
