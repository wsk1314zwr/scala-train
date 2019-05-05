package com.wsk.bigdata.scala.ObjectOriented

object SparkConfApp {
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf
    sparkConf.setAppName("test").setMaster("master")
    sparkConf.print()
  }
}

class SparkConf {
  var master: String = _
  var appName: String = _

  def setMaster(master: String): SparkConf = {
    this.master = master
    this
  }

  def setAppName(appName: String): SparkConf = {
    this.appName = appName
    this
  }

  def print(): Unit = {
    println(this.appName + ":" + this.master)
  }
}
