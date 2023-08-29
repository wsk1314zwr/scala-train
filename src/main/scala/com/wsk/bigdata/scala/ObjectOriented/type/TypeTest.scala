package com.wsk.bigdata.scala.ObjectOriented

import com.wsk.bigdata.scala.ObjectOriented.TypeTest.Extensions

/**
 * 1)在Scala中，除了class、trait、object 会产生类型，还可以用type关键字声明类型。
 * 2) type 声明别名(alias)(通常用于声明复杂类型或定义一个抽象类型),甚至是定义函数
 * 3) type申明的别名可以向class、trait那样被继承
 * 4) 注意首字母大写
 * 5) 如果方法的入参是type，type是函数，使用时那么可以传入Case类，该case类要申明属性属性的个数和类型要和函数入参保持一致，Case类要继承父类，其父类要和函数的出参保持一致
 */
object TypeTest {
    //申明一个type别名，本质其是一个函数
    type Extensions = Peo => Unit

    type SAY = (Peo, Peo) => Peo

    def main(args: Array[String]): Unit = {
        val test = new WskTest
        test(new Peo())
        //因为case class类其参数有几个，即表明它自动实现入参数为几个的apply方法,apply方法的出参数是其自己，若想当 SAY用，即本质要继承函数，则case的入参以及继承要和SAY的函数的入参和出参数保持一致
        val str = add(WskTest2)
        print(str)

    }

    //传入的 数据类型是 type SAY，本质是个函数
    def add(say:SAY):String = {
        //实现SAY的对象，其必须是继承了Function2，其一个有个双参数的函数
        val peo1 = new Peo()
        peo1.name = "p1"
        val peo2 = new Peo()
        peo2.name = "p2"
        val peo = say.apply(peo1, peo2)
        peo.say()
    }
}


//继承别名，需要重写Function1的apply方法
class WskTest extends Extensions {
    //
    override def apply(v1: Peo): Unit = {
        v1.sleep()
    }
}

//
case class WskTest2(peo1: Peo, peo2: Peo) extends Peo {
    val add = "这个是WskTest2的add结果";

    override def say(): String = {
        add
    }
}


