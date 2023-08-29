package com.wsk.bigdata.scala.enuM

/**
 * 1) scala中并没有类似于java的枚举关键字，需要通过实现scala.Enumeration来实现的
 * 2) 第一行是声明一个枚举名称为Color。
 * 3) 第二行是声明了一个类型别名。和这个枚举名字相同，其实并不是必须的，也可以定义成其他名称。但是为了后续使用枚举时代码的可读性，一般来说定义成相同的。这里的Value是类，没有别名，那么后续使用时枚举的类型都是Value难以区分
 * 4) 第三行声明了这个枚举的各枚举项,这里的Value就是方法def Value: Value。只是他的方法名和返回值都叫Value而已。 而方法Value具体的功能，就是返回一个新的Value的实例，并且id每次都自动加1.
 * 5) 第四行结束
 *
 */
object Color extends Enumeration {
    type Color = Value
    val RED, GREEN, BLUE = Value
}
