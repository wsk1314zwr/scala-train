package com.wsk.bigdata.scala.collection

import scala.collection.mutable.ArrayBuffer

object ArrayTest {

  /**
    * 数组
    * 1)Array定长数组，ArrayBuffer变长数组，生产中常用变长
    * 2)Array(T*)方式创建的数组，调用的apply方法，该方法中new Array()了,案例类也可以不new就可以创建对象
    * 3)不管是object()调用apply方法还是案列类，最终的底层必然一定是有new，不new对象，JVM怎么能接受
    * 4)java》StringBuffer:线程安全的，底层代码方法有synchronized锁，jdk1.0出的，StringBuilder:线程不安全的，JDK1.5出。后者性能更好
    * 5)java》Vector:线程安全的，ArrayList：线程不安全的，同理Vector先出现
    * 6) ArrayBuffer添加元素 是通过 += 或者 ++=
    *
    */

  def main(args: Array[String]): Unit = {

    //创建定长数组方式一
    val array = new Array[String](3)
    array(0) = "w"
    array(1) = "s"
    array(2) = "k"
    println(array(0), array(1), array(2))
    //创建定长数组方式二
    val array2 = Array("k", "s", "w")
    println(array2(0), array2(1), array2(2))
    //创建变长数组方式一
    val strings = new ArrayBuffer[String]()
    strings += "定"
    strings += "长"
    strings += "1"
    println(strings(0), strings(1), strings(2))
    val strings2 = ArrayBuffer[String]()
    strings2 += "定"
    strings2 += "长"
    strings2 += "2"
    println(strings2(0), strings2(1), strings2(2))


    /**
      * 一些常用的API
      */
    //数组转字符串
    println("--------------------常用的集合API操作----------------------------")
    println(array2.mkString(","))
    println(array2.mkString("<", ":", ">"))
    println(array2.min, array2.reduce(_ + _))
    //变长添加元素
    strings2 += "0"
    strings2 += ("1", "2", "3")
    strings2 ++= Array("4", "5")
    strings2.insert(0, Array("6", "7"): _*)
    println(strings2.mkString(","))
    //减去元素
    val arr = ArrayBuffer[Int](1,2,3)
    arr.remove(1,2)
    println(arr.mkString("<",":",">"))
    //变长转定长
    println(strings2.toArray.mkString(":"))
  }

}
