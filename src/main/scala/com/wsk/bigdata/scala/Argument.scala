package com.wsk.bigdata.scala

object Argument {
  /**
    * 变长参数
    * 1）声明：def xxx(name:T*)
    * 2)调用：xxx(T,T,T)或XXX(Collection[T]:_*)
    * 3）变长所有的参数必须是同一类型
    *
    * 默认参数
    * 1）声明：def xxx(name:T=vale)
    * 2)有默认参数即使调用不传参，也不能省略括号()
    */
  def main(args: Array[String]): Unit = {

    println(sum(1, 2))
    println(sum(1, 2, 3))
    println(sum(List(1, 2, 3): _*))

    println(defa("ruoze"))
    println(defa())
  }

  def sum(elements: Int*): Int = {
    var result = 0
    for (e <- elements) {
      result += e
    }
    result
  }

  def defa(name: String = "wsk"): String = {
    name
  }


}
