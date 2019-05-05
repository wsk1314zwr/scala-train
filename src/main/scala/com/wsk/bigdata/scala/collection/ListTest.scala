package com.wsk.bigdata.scala.collection

import scala.collection.mutable.ListBuffer

object ListTest {

  /**
    * List集合
    * 1)一种类型的N个元素集合，有序可重复，Set是无序不重复的
    * 2)List：定长，ListBuffer：变长
    * 3)Nil：即空的List()
    */
  def main(args: Array[String]): Unit = {

    //创建定长List方式一
    val ints = List(1, 2, 3)
    println(ints)
    //创建定长list方式二
    val int2 = 0 :: 1 :: 2 :: 3 :: Nil
    println(int2)
    println(int2.head)
    println(int2.tail)
    //常用操作

    //创建变长List方式一
    val ints3 = ListBuffer(1,2,3,4)
    ints3 += 5
    ints3 += (6,7)
    ints3 ++= List(9,10)
    println(ints3)
    println(ints3.toList)
    ints3 -=5
    println(ints3)
  }
}
