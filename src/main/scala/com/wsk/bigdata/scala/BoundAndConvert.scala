package com.wsk.bigdata.scala

/**
  * 类型上界下界：一般用于函数参数类型的定义
  * 上界：语法 [S < :T] ,表示传入的类型S必须是T的子类或本身
  * 下界：语法 [S > :T],表示传入的类型S必须是T的父类或本身
  *
  * 类型协变逆变：一般用于类的定义
  * 协变：语法 [+A] ,变量的值可以是本身类型或者其子类的类型
  * 逆变：语法 [-A] ,变量的值可以是本身类型或者其父类的类型
  */
object BoundAndConvert {


  class Animal {}
  class Bird extends Animal {}

  //上界
  class UpperBound[-T](t: T) {
    def get[U <: T](u : U)= {println(u)}
  }
  //下界
  class LowwerBound[+T](t: T) {
    def use[U >: T](u : U) = {println(u)}
  }

  //协变，子类对象赋予父类变量
  class Covariant[+T](t:T){}
  val cov = new Covariant[Bird](new Bird)
  val cov2:Covariant[Animal] = cov

  //逆变，父类对象赋予子类变量
  class Contravariant[-T](t: T) {
  }
  val c: Contravariant[Animal] = new Contravariant[Animal](new Animal)
  val c2: Contravariant[Bird] = c

}
