package com.wsk.bigdata.scala.io



import java.net.URI

import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.{FileSystem, Path}

object HDFSOprator {
  /**
    * hdfs完全是通过FileSystem来进行所有的操作的
    */
  def main(args: Array[String]): Unit = {
    val config = new Configuration()
    //创建文件
    val fs = FileSystem.get(new URI("hdfs://192.168.175.135:9000"),config)
    val flag1 = fs.mkdirs(new Path("/java/hdfs"))
    println(flag1)
    //写文件
    val out = fs.create(new Path("/java/hdfs/test.txt"))
    out.writeBytes("你好，操作成功")
    out.flush()
    out.close()

    fs.close()
  }

}
