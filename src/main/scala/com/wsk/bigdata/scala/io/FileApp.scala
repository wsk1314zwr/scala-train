package com.wsk.bigdata.scala.io

import java.io.File

import scala.io.Source

object FileApp {
  def main(args: Array[String]): Unit = {
    /**
      * 文件读取
      * 1)通过Source类去操作文件
      * 2)通过Source类也可以读取网络返回的数据
      */

      //操作文件

    val lines = Source.fromFile(new File("C:\\Users\\57132\\Desktop\\常用零散知识.txt"))
      println(lines.mkString)
    //读取RESTFUL数据
    val lin = Source.fromURL("http://www.baidu.com")
    for(l <- lin.getLines()){
      println(l)
    }
  }
}
