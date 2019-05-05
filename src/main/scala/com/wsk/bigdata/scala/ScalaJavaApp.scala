package com.wsk.bigdata.scala


import com.wsk.bigdata.java.User
object ScalaJavaApp {

  /**
    * scala项目中添加java代码
    *
    *
    */
  def main(args: Array[String]): Unit = {
    val wsk = new User("wsk",24)
    wsk.eat()
  }


}
