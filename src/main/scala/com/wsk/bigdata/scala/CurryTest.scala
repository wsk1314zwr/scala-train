package com.wsk.bigdata.scala

/**
  *  curry 函数：函数有多个参数列表
  * 	列：def currytest(x : int)(y : int) = x+y    调用：val rel = currytest(1)(2) 或者 val rel = currytest(1){2}返回 3 本质上它调了两个传统函数，详解为val sec = currytest(1)_ ,val rel=sec(2),传入第一个参数返回的是一个函数，传入第二个参数才是结果
  */
object CurryTest {

  def main(args: Array[String]): Unit = {

    //调用
    println(String.format("测试一：测试打印测试值1： %s",curryTest(2)(4).toString))
    println(String.format("测试一：测试打印测试值2： %s",curryTest(2){4}.toString))

    //curry 解析用偏应用函数表达式方式，把占位符标注用在currytest里。
    val secondFun = curryTest(2)_
    println(String.format("测试二：f返回了第二个参数： %s",secondFun.toString()))
    println(String.format("测试二：f返回最终结果： %s",secondFun(4).toString))

    //测试入参为函数
    val result0  = curryTest2(3) (a => a*3)

    val result = curryTest2(3) {
      _ * 3
    }

    val result2 = curryTest2(3)(_ * 3)

    println(String.format("测试三：测试入参为函数： %s",result0.toString))
    println(String.format("测试三：测试入参为函数： %s",result.toString))
    println(String.format("测试三：测试入参为函数： %s",result2.toString))

    val result3 = curryTest3(3)(()=> 3* 3)

    println(String.format("测试三：测试入参为函数： %s", result3.toString))


  }

  //curry化函数，多个参数列表
  def curryTest(x :Int)(y:Int): Int ={
    x + y
  }

  //curry化函数，多个参数列表，参数可为函数
  def curryTest2(x: Int)(y: Int => Int): Int = {
    y(x+2)
  }

  //curry化函数，多个参数列表，参数可为函数
  def curryTest3(x: Int)(y: () => Int): Int = {
    x + y()
  }
}
