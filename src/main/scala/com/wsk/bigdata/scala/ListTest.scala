package com.wsk.bigdata.scala

/**
  * List集合测试 ，是不可变集合，添加元素将产生新的集合
  */
object ListTest {
  def main(args: Array[String]): Unit = {
    var list = List(1,2,3)
    test(1::2::3::Nil)
    test(list::4::Nil)   //这个并不是集合的相加添加操作 ，这个是表示一个集合中两个元素一个是list(1,2,3) 一个是
    test(list.+:(4))    //集合首端添加元素，产生新集合
    test(list :+ 4)    //集合尾端添加元素，产生新集合
    test(list)
  }

  def test(x:List[Any]): Unit ={
    x.foreach(a =>println("集合打印输出"+ a.toString))

    println("-------------------------------------")
  }
}
