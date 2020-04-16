package com.wsk.bigdata.scala.highLevelFunction

object KebianCanshu {

  def main(args: Array[String]): Unit = {
    val words = Array("hello","ni","hao")

    print(words:_*)
  }

  def print(words: String*): Unit = {
    var word = ""
    for (w <- words) {
      word = word + w
    }
    println(word)
  }
}
