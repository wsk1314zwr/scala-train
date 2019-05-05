package com.wsk.bigdata.scala.highLevelFunction

object Test {

  /**
    * 高阶函数：传入的参数有函数或者返回的参数有函数
    */
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4)
    //map:映射
    val mapList = list.map(_ * 2)
    println(mapList)
    //filter：过滤
    val filterList = mapList.filter(_ > 5)
    println(filterList)
    //reduce:聚合
    val reduceList = list.reduce(_ + _)
    println(reduceList)
    //reduce：右边
    val reduceRiteList = list.reduceRight((x, y) => {
      println(x + "," + y)
      x - y
    })
    println(reduceRiteList)
    //fol
    val i = list.fold(10)((x, y) => {
      println(x + "," + y)
      x + y
    })
    println(i)

    //max,min
    println(list.max)
    println(list.min)

    //count
    println(list.count(_ > 2))

    //flatmap:平铺, =flatten+map
    val list2 = List(List(1, 2), List(3, 4))
    println(list2.flatMap(_.map(_ * 2)))
  }

}
