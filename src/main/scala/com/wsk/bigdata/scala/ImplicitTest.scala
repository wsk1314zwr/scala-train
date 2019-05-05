package com.wsk.bigdata.scala

import java.io.File

import scala.io.Source

object ImplicitTest {

  /**
    * 隐式转换：implicit def man2Superman(man: Man): SuperMan = new SuperMan(man.name)
    * 1)偷偷的增强某个类，类似于java中的代理
    * 2)可以将定义的implicit封装起来，然后使用import去调用,
    * 3)导入隐士转换后，在整个作用域都是有效的
    */
  def main(args: Array[String]): Unit = {


    import ImplicitAop.man2Superman
    val man = new Man("wsk")
    man.eat()
    man.fly()


    import ImplicitAop.file2RiceFile
    //举列增强File
    val file = new File("C:\\Users\\57132\\Desktop\\常用零散知识.txt")
    println(file.read())

  }
}


class Man(val name: String) {
  def eat(): Unit = {
    println(this.name + " eat ..........")
  }
}

class SuperMan(val name: String) {
  def fly(): Unit = {
    println(this.name + "  fly ...........")
  }
}


class RichFile(val file:File){
  def read()={
    Source.fromFile(file).mkString
  }
}



object ImplicitAop{

  //定义隐式转换,参数类型:返回类型，表示被转换的方向
  implicit def man2Superman(man: Man): SuperMan = new SuperMan(man.name)


  implicit def file2RiceFile(file: File):RichFile=new RichFile(file)

}