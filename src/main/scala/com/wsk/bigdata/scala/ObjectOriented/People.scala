package com.wsk.bigdata.scala.ObjectOriented

/**
  * 1.变量申明必须有值，占位符就是默认值，不然会报错，或者将类修改为抽象类
  * 2.scala的类型推导并不是想象中那么强大，因为变量都是有值的傻子都会推导其类型了
  * 3.ConcurrentHashMap是java线程安全的map集合
  * 4.private[包]  表示只给包用，如 ：若方法上修饰 private[this],表示该方法只在当前对象内调用
  */
object People {
  def main(args: Array[String]): Unit = {
    val peo = new Peo
    peo.name="x"
   peo.sleep()
//   peo.py("cxk")

  }

}


class Peo() {
  var name: String = _
  val city = "hefei"

  def sleep(): Unit = {
    println(name + "zzzz....")
  }

  private[this] def py(name2: String): Unit = {
    println(name + "与" + name2 + "做py交易")
  }

  def say(): String = {
    ""
  }
}
