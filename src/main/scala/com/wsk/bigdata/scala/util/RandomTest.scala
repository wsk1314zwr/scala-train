package com.wsk.bigdata.scala.util

import scala.util.Random

object RandomTest {
  def main(args: Array[String]): Unit = {
    for(x <- 0 to 10000){
      Thread.sleep(100)
      println( new Random().nextInt(2))
    }

  }
}
