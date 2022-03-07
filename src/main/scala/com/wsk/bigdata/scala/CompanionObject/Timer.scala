package com.wsk.bigdata.scala.CompanionObject

object Timer {

    /**
     * 伴生对象（Object）与伴生类（Class）
     * 0）class A 与Object A，则前者是后者的伴生类，后者是前者的伴生对象
     * 1）调用属性和方法直接可通过 ObjectName.。它类似于java的static修饰属性和方法
     * 2)第一次调用Object会将{}中代码都执行一遍
     * 3)object()=>调用的是Object.apply方法，同时会满足情况2，该apply一定是new 伴生类的对象返回
     * 4)(new 对象)()=>调的是Class.apply方法
     *
     * 伴生类和伴生对象之间的区别与关系
     * 1.在Scala中声明private变量,Scala编译器会自动生成get,set方法
     * 2.在Scala中变量需要初始化
     * 3.在Scala中没有静态修饰符,在object下的成员全部都是静态的,如果在类中声明了与该类相同名字的object则该object是该类的”伴生对象”，所以对于一个class来说，所有的方法和成员变量在实例被 new 出来之前都是无法访问的
     * 可以理解为Scala把类中的static集中放到了object对象中,伴生对象和类文件必须是同一个源文件,可以用伴生对象做一些初始化操作.
     * 4.在Java中可以通过interface实现多继承,在Scala中可以通过特征(trait)实现多重继承,但是与Java不同的是,它可以定义自己的属性和实现方法体
     * 5.object不能提供构造器参数,也就是说object必须是无参的
     * 6.在Scala中,类名可以和对象名为同一个名字,该对象称为该类的伴生对象,类和伴生对象可以相互访问他们的私有属性,但是它们必须在同一个源文件中
     */
    def main(args: Array[String]): Unit = {
        //调用Object对象的方法,它类似于java的static修饰属性和方法
        println(Timer.addCount)
        println(Timer.addCount)
        println(Timer.addCount)

        //Object对象中的代码执行顺序
        val test = ApplyTest
        println(test)  //不会执行任何apply方法
        println(ApplyTest())  //执行object中apply
        for (i <- 1 to 10) {
            ApplyTest.addCount()
        }
        println(ApplyTest.count)

        //new 一个对象
            val applyTest = new ApplyTest
            println(applyTest)
            applyTest.method()

        //object apply 方式创建对象
//    val test = ApplyTest()
//    test.method()
//class appy方法调用
val test2 = new ApplyTest()
        println(test2())
    }

    var count = 0;

    def addCount(): Int = {
        count += 1
        count
    }
}


object ApplyTest {
    println("enter ...")

    var count = 0

    def addCount() = {
        count += 1
        count
    }

    println("out ..........")

    def apply() = {
        println("object apply")
        new ApplyTest();
    }
}


class ApplyTest {

    def method(): Unit = {
        println("this is method function")
    }

    def apply() = {
        println("class apply")
    }
}
