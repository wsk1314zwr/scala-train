package com.wsk.bigdata.scala.collection

import scala.collection.mutable


object MapTest {

  /**
    * map集合
    * 1)存放的是KV
    * 2)取值，map(XX)或map.get(XXX)或map.getOrElse(XXX,default),常用第三种方式
    * 3)Map默认是使用不可变的，scala.collection.mutable.Map是可变的Map带“->”,生产中常用的是HashMap
    * 4)Map的遍历同java
    * HashMap集合
    * 1）同样分为定长和变长
    *
    */
  def main(args: Array[String]): Unit = {

    //创建不可变map
    val map = Map("wsk" -> 1, "big" -> 2)
    println(map)

    //创建可变的map
    val map2 = mutable.Map(2 -> 2, 3 -> 3)
    map2 += 4 -> 4
    map2 += (5 -> 5, 6 -> 6)
    map2 ++= Map(7 -> 7)
    println(map2)
    //创建定长hashMap
    val iHashMap = collection.immutable.HashMap(1 -> "h")
    println(iHashMap)
    //创建变长的HashMap
    val mhasfMap = mutable.HashMap[String, Int]()
    mhasfMap("s") = 1
    mhasfMap("k") = 2
    mhasfMap("a") = 3
    println(mhasfMap)



    //常用的API操作
    //取值
    println(map("big"))
    println(map.get("wsk"))
    println(map.getOrElse("wsk2", 0))
    //遍历
    for ((k, v) <- map) {
      println(k + ":" + v)
    }
    for(k <- map.keys){
      println(k+":"+map(k))
    }
    for(v<-map.values){
      println(v)
    }

  }
}
