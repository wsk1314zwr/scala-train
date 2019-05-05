package com.wsk.bigdata.scala.collection

case class DOG(id: String, name: String) {
  def sleep(): Unit = {
    println(this.name + "zzzzzzzzzz")
  }
}

object CaseClass {
  /**
    * 案例类
    * 1）case class类似于java中的pojo类
    * 2）case class实例化是不需要new的,底层有默认的apply方法
    */
  def main(args: Array[String]): Unit = {
    val dog = DOG("001", "旺财")
    dog.sleep()
  }
}
