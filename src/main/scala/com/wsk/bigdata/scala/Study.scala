package com.wsk.bigdata.scala

import java.io.{FileNotFoundException, FileReader, IOException}
import java.util.concurrent.ConcurrentHashMap
import scala.language.postfixOps
import scala.util.{Failure, Success, Try}
import scala.util.matching.Regex

object Study {

    def main(args: Array[String]) {

//        println("hellow word")
//        println("你好！中国！")
//        println(msg2444)
//        println(msg2)
//        println(msg3)
        //    println(max(3,5))
        //    println(max1(3,6))
        //    println(max2(3,7))
        //    println(xunhuan(4,5))
        //    shuzu()
//        objectType
//            funTest()

//    xunhuanceshi()

        //    funTest()
        //    shuzuTest()
        //    CollectionTest()

//        classObeTest()

//        println(matchTest(5))
//        println(matchTest("34。34"))

        //            regexTest()
        //            execptionTest()
        //Try test
        val person = Person("wsk", 35)
        val wsk = tryTest(person, "name")
        print(wsk)
//        collectionTest()
    }


    /**
     * 变量的申明
     * 1.变量申明必须有值(和java一样)，占位符就是默认值，不然会报错，或者将类修改为抽象类
     * 2.scala的类型推导并不是想象中那么强大，因为变量都是有值的傻子都会推导其类型了
     *  3.var表示变量，val是常量(表示不可修改)，能用val的情况下尽量用val
     *  4.变量确定了数据类型则不可更改，表明其是强类型语言
     */
    val msg = "hellow1"
    var msg2: String = "hellow2"
    val msg3: Long = 0
    val msg4: Double = 2
    val msg5: Float = 3.1f
    var msg2444: String = _

    /**
     * 访问修饰符：public、protected, private
     * public为默认的访问控制符
     * private修饰的资源只能在 包含了成员定义的类或对象内部可用,比 Java 更严格，在嵌套类情况下，外层类甚至不能访问被嵌套类的私有成员。
     * protected它只允许保护成员在定义了该成员的的类的子类中被访问，比java严格，java除了定义了该成员的类的子类可以访问，同一个包里的其他类也可以进行访问。
     * private[包名|类或单例对象]或protected[包名|类或单例对象],表示该方法在该包下有效，如private[this],在当前对象内部可被调用
     */

    /**
     * 运算符，同java
     * 算术运算符：加、减、乘、除
     * 关系运算符：等于，不等于，大于。。。。。。小于等于
     * 逻辑运算符：与、或、非
     * 位运算符：a= 60 ，把变量值对应的二进制进行位操作，～：所有位取反， &：两个二进制，按位与 ，｜：两个二进制，按位或， ^:两个二进制，按位异或(两个二进制表示不同则为1相同则为0)
     * <<:左移动运算符，如a << 2 输出结果 240 ，即扩大2的2次方，>>:右移动运算符,正数高位补0，负数高位补1，>>>：无符号右移，高位都是补0
     * 赋值运算符: =:(+=、-=、*=、/=、%=、<<=、>>=、&=、^=、|=)(都是先操作后赋值)
     */

    /**
     * 判断语句，同java
     * if （）{}else{}
     */

    /**
     * 循环：同java
     * while、do..while 使用breake结束循环
     * 增强for循环，它不能设置指定次数得循环
     * 语法 ：循环数字for( var x <- Range ){statement(s)}，循环对象 for( var x <- List ){statement(s)}
     *
     * 区间：底层都是调用的Rang类实现的
     * a to b,左闭右闭
     * a until b，左闭右开
     *
     */
    def xunhuanceshi(): Unit = {
        var i = 0
        //包括10
        for (i <- 3.to(10)) {
            println("区间循环测试 i=" + i)
        }
        for (i <- 3 to(10, 2)) {
            println("跳跃循环测试 i=" + i)
        }
        i = 0
        //不包括10
        for (i <- 3 until 10) {
            println("until循环测试 i=" + i)
        }

        var a = 0
        var b = 0
        // for 双层循环
        for (a <- 1 to 3; b <- 1 to 3) {
            println("Value of a: " + a)
            println("Value of b: " + b)
        }

        // 循环集合
        var c = 0
        val numList = List(1, 2, 3, 4, 5, 6)
        for (c <- numList) {
            println("Value of a: " + c)
        }
    }

    /**
     * 循环体:while
     */
    def xunhuan(x: Int, y: Int): Int = {
        var count = 0
        var i = 0
        while (i < y) {
            count += x
            i += 1

        }
        println(count)
        count
    }

    /**
     * 数组环体
     *
     */
    def shuzu(): Unit = {
        val sts = new Array[String](3)
        sts(0) = "wsk"
        sts(1) = "is"
        sts(2) = "good"

        for (arg <- sts) {
            println("数组循环" + arg)
        }
    }

    /**
     * scala 函数定义
     *
     **/
    def max(x: Int, y: Int): Int = {
        if (x > y) x
        else y
    }

    def max1(x: Int, y: Int) = {
        if (x > y) x
        else y
    }

    def max2(x: Int, y: Int) = if (x > y) x else y


    //学习

    /**
     * 概念：对象（object）、类（class）、方法、函数、变量
     * 类是对象的抽象
     */

    /**
     * 作用域
     * private[x] 与 protected[x]
     * 这里的x指代某个所属的包、类或单例对象。如果写成private[x],读作"这个成员除了对[…]中的类或[…]
     * 中的包中的类及它们的伴生对像可见外，对其它所有类都是private。
     *
     */


    /**
     * 方法与函数（方法与函数本质上没什么大的区别，函数是一个对象是能够直接赋值给变量的，方法必须是def定义,有些翻译书籍中函数和方法是没有区别的
     * Scala 中的方法跟 Java 的类似，方法是组成类的一部分。
     * Scala 中的函数则是一个完整的对象，Scala 中的函数其实就是继承了 Trait 的类的对象。
     * Scala 中使用 val 语句可以定义函数，def 语句定义方法。
     * scala 中函数中定义的函数，如果被匿名函数使用付给变量，则赋予的过程放在函数申明后
     *
     * 参数调用方式：传值调用（参数只计算一次），传名调用（主动调用名对应的方法，参数格式为 a：=>类型，每次使用传名调用时，解释器都会计算一次表达式的值）
     * 可变数组：def funcName(args:String*)
     * 默认参数 def addInt( a:Int=5, b:Int=7 )：Int = {xxx}
     * 高阶函数：Scala 中允许使用高阶函数, 高阶函数可以使用其他函数作为参数，或者使用函数作为输出结果。
     * 内嵌函数：允许在函数内再创建函数，该函数为局部函数
     * 匿名函数：var f = (参数列表) => 函数体
     * 偏应用函数：是一种表达式，你不需要提供函数需要的所有参数，只需要提供部分，或不提供所需参数。
     * 指定函数参数名：调用函数时,通过指定函数参数名，并且不需要按照顺序向函数传递参数
     * 函数柯里化：指的是将原来接受两个参数的函数变成新的接受一个参数的函数的过程。新的函数返回一个以原有第二个参数为参数的函数:
     * def add(x:Int,y:Int)=x+y 变为 def add(x:Int)=(y:Int)=>x+y ，调用方式由：add(1,2)变为add(1)(2)
     *
     */
    def funTest(): Unit = {
        //匿名函数的定义
        val f = (x: Int) => x + 3
        println(f(1))

        //高阶函数：返回值是函数
        def str222 = () => apply(layout, 10)

        println(str222)

        def str223 = apply(layout, 10)

        println(str223)

        def str224(): String = apply(layout, 10)

        println(str224)

        // 内嵌入函数函数内部的函数被赋给其他变量，则赋予的过程放在函数申明后，其是局部函数
//    val str = apply(layout, 10)

        ////高阶函数：传入是函数， 函数 f 和 值 v 作为参数，而函数 f 又调用了参数 v
        def apply(f: Int => String, v: Int) = f(v)

        def layout[A, F](x: F) = "[" + x.toString() + "]"

        // 内嵌入函数被赋给其他变量，则赋予的过程放在函数申明后，其是局部函数
        val str = apply(layout, 10)


        //偏应用函数，绑定第一个 layout 参数，第二个参数使用下划线(_)替换缺失的参数列表
        val intToString = apply(layout, _)
        println(intToString(1))
        println(intToString(2))
        println(intToString(3))

    }

    /**
     * 参数为函数：
     *
     * 方法中传递的参数为函数： def funName[T,U](f: Iterator[T] => U ,resHandler: (Int, U) => Unit)={ TODO}
     * 如上：传入两个函数，第一个函数 f 的入参是Iterator[T] 返回是U类型 ，
     * 第二个函数入参是int以及 U类型，无返回。
     *
     */

    /**
     * 闭包：可以简单的认为是可以访问一个函数里面局部变量的另外一个函数
     */

    /**
     * 字符串，同java,直接调的是java的
     * String 是一个不可变的对象，所以该对象不可被修改。这就意味着你如果修改字符串就会产生一个新的字符串对象。
     */

    def stringTest(): Unit = {
        //可变的字符串
        val buf = new StringBuilder()
        buf += 'a'
        buf ++= "bcdef"
        println("buf is : " + buf.toString.length)

        //格式化字符串
        var floatVar = 12.456
        var intVar = 2000
        var stringVar = "菜鸟教程!"
        var fs = printf("浮点型变量为 " +
                "%f, 整型变量为 %d, 字符串为 " +
                " %s", floatVar, intVar, stringVar)
        println(fs)

    }

    /**
     * 数组：var nam = new Array[String](3)
     */

    def shuzuTest(): Unit = {
        val strings: Array[String] = new Array[String](3)
        strings(0) = "1"
        strings(1) = "1"
        strings(2) = "3"
        for (str <- strings) {
            print(str)
        }
        for (i <- strings.indices) {
            print(i)
        }
        var z = Array("Runoob", "Baidu", "Google")


    }


    /**
     * 集合（Collection）:  分为可变（可添加修改元素）以及不可变（添加修改返回新的集合）
     * List：List的特征是其元素以线性方式存储，集合中可以存放重复对象。不可变
     * Set:Set是最简单的一种集合。集合中的对象不按特定的方式排序，并且没有重复对象。分为可变和不可变两种
     * Map：Map 是一种把键对象和值对象映射的集合，它的每一个元素都包含一对键对象和值对象。两种类型，可变与不可变
     * 元组：元组是不同类型的值的集合,是不可变的，最长为22
     * Option[T]:Option[T] 是一个类型为 T 的可选值的容器： 如果值存在， Option[T] 就是一个 Some[T] ，如果不存在， Option[T] 就是对象 None
     * (重要)Scala 使用 Option、Some、None，避免使用 Null，None 被声明为一个对象，而不是一个类而java的null是关键字
     */

    def collectionTest(): Unit = {
        //list
        val lists = List(1, 2, 4)
        for (v <- lists) {
            print(v)
        }
        println()
        //set
        val sets = Set(1, 2, 6)
        for (v <- sets) {
            print(v)
        }
        println()
        //map
        val maps: Map[Char, Int] = Map()
        val maps2 = Map("1" -> 2, "2" -> 1)
        for (v <- maps2.keys) {
            println(maps2.get(v).get)
        }
        val map3 = new ConcurrentHashMap[String, String]()

        println()

        //元组,
        val tuples = (1, 2.1, '2', "4")
        var sun = "" + tuples._1 + tuples._2 + tuples._3 + tuples._4
        println("tuples sum = " + sun)
        tuples.productIterator.foreach(i => println("tuples iterator" + i))

        //Option[T]
        val mpasss: Map[String, Int] = Map("key1" -> 2)
        val values1: Option[Int] = mpasss.get("key1")
        val values2: Option[Int] = mpasss.get("key2")
        val value2 = values2.getOrElse("*")
        println("value =" + value2)
        println("Options[T] =" + values1)
        println(values2 == None)

    }

    /**
     * Iterator:迭代器 it 的两个基本操作是 next 和 hasNext。
     */

    /**
     * 类与对象
     * 类的继承：1、重写一个非抽象方法必须使用override修饰符。
     * 2、只有主构造函数才可以往基类的构造函数里写参数。
     * 3、在子类中重写超类的抽象方法时，你不需要使用override关键字。
     *
     * 类的单列模式：为了解决scala中无static关键字，而想直接调用摸个某个类的属性或方法的问题
     * 在类的同一个文件中创建 生成一个同名的Object对象，类和它的伴生对象可以互相访问其私有成员。
     * 该同名对象被称之为该类的伴生对象，该同名类被称之为该对象的伴生类
     */
    def classObeTest(): Unit = {
        val point = new Point(1, 3)
        point.move(1, 1)
    }

    /**
     * 特征：Trait相当于 Java 的接口,内部可以有实现的方法也可以有未实现的方法
     * 一个类可以继承多个Trait
     * 特征构造顺序：
     * 调用超类的构造器；
     * 特征构造器在超类构造器之后、类构造器之前执行；
     * 特征由左到右被构造；
     * 每个特征当中，父特征先被构造；
     * 如果多个特征共有一个父特征，父特征不会被重复构造
     * 所有特征被构造完毕，子类被构造。
     *
     */

    /**
     * 模式匹配：match  case 对应 Java 里的 switch，但是写在选择器表达式之后。即： 选择器 match {备选项}，其匹配的选项类型更多更加的复杂
     * 样例类：使用了case关键字的类定义就是就是样例类(case classes)，
     * 1。构造器的每个参数都成为val，除非显式被声明为var，但是并不推荐这么做
     * 2。在伴生对象中提供了apply方法，所以可以不使用new关键字就可构建对象
     * 3。提供unapply方法使模式匹配可以工作
     * 4。生成toString、equals、hashCode和copy方法，除非显示给出这些方法的定义
     */

    def matchTest(x: Any): Any = x match {
        case "1" => 1
        case x: Int => "this is Scala Int"
        case "3" => 3
        case 0 | "" => false    //在0或空字符串的情况下,返回false
        case 2 | 4 | 6 | 8 | 10 => println("偶数")     //在10及以下的偶数,返回"偶数"
        case x if x == 2 || x == 3 => println("two's company, three's a crowd")    //在模式匹配中使用if
        case Person("bob", 3) => print("hi bob")
        case _ => 9
    }

    case class Person(name: String, age: Int)

    /**
     * 正则表达式：
     *
     */
    def regexTest(): Unit = {
        var pattrem = "scala".r()
        var str = "scala is very easy!"
        println(pattrem.findFirstIn(str))

        val pattern2 = new Regex("(S|s)cala") // 首字母可以是大写 S 或小写 s
        val str2 = "Scala is scalable and cool"

        println((pattern2 findAllIn str2).mkString(",")) // 使用逗号 , 连接返回结果
    }

    /**
     * 异常捕获：同java try{}catch{}finally{}，但是多个可能的异常使用的模式匹配方式写的
     */

    def execptionTest(): Unit = {
        try {
            val f = new FileReader("input.txt")
        } catch {
            case ex: FileNotFoundException => {
                println("Missing file exception")
            }
            case ex: IOException => {
                println("IO Exception")
            }
        } finally {
            println("Exiting finally...")
        }
    }

    /**
     *
     * Try:scala提供的用于判断某段代码运行是否发生异常：https://blog.csdn.net/Vector97/article/details/104054499
     *  1）其返回的子类是Success表示代码块运行正常以及正常的结果值
     *  2）返回Failure表示代码块运行异常，以及异常对象，相较于Option，Option只能返回是否有值，并不能展示异常信息
     *
     */
    def tryTest(o: Any, name: String): Any = {
        /**
         * 1）可以将将()省略，如下面注释的代码，但是不能写成 ()=>{val xxx}，因为Try apply方法是直接使用,这样会导致{}的代码并不会在Try的apply方法中进行
         * 2）若是定义为 ()=>{val xxx}，那么apply的r也要定义为()=> T,使用也是r(),说白了1是2的简写
         * 3) recover:接受任何异常并将其转换为其它有效的结果，若没有异常则返回Success()
         */
        val name1 = Try({
            val field = o.getClass.getDeclaredField(name)
            field.setAccessible(true)
            field.get(o)
        }) match {
            case Success(value) => value
            case Failure(exception) => throw exception
        }
        val name2 = Try {
            val field = o.getClass.getDeclaredField(name)
            field.setAccessible(true)
            field.get(o)
        } match {
            case Success(value) => value
            case Failure(exception) => throw exception
        }

        val name3 = Try({
            val field = o.getClass.getDeclaredField(name)
            field.setAccessible(true)
            field.get(o)
            println(0/0)
        }) recover {
            case e: Exception =>
                println("异常", e)
                //这里的抛出异常，并不是往上层抛出，而是生成的Failure对象含有异常信息，Failure重写了recover其捕获了非致命的异常
                throw e
        }
        println(name3)
        "123"
    }

    /**
     * 提取器:Extractor,提取器是一个带有unapply方法的对象.通过unapply从传递给它的对象中提取出构造该对象的参数
     * 1、Scala 提取器是一个带有unapply方法的对象。unapply方法算是apply方法的反向操作：unapply接受一个对象，
     * 然后从对象中提取值，提取的值通常是用来构造该对象的值。
     * 3、对象的实例化可以通过提取器（默认执行apply方法）完成，如实例中实例一个双倍数字对象
     * 4、match 模式匹配中case 后使用提取对象，如果编译器会将要参与比对的参与传入提取器的Unapply方法，如是咧中那样 case Test(num)
     * 实际时执行 unapply（数值）这个方法，得到num为8，然后。。。(注意被配置的x的类型需要与apply入参类型一致，Unapply返回值就是num变量的值)
     *
     */


    /**
     * 文件读取：I/O
     * 与java差别不大，略。。。。。。。。。。。。
     */

    /**
     * 类型判定：尤其是在不知道具体对象类型时any会经常的用到
     * 判断参数具体类型 .isInstanceOf[T]，
     * 将对象转换为某类型 asInstanceof[T]
     */
    def objectType(): Unit = {

        var a: Any = 1;
        //    var a:Long = 1;
        println("变量a是否是整型：" + a.isInstanceOf[Int])
        println("变量a是否是整型：" + a.asInstanceOf[Int])


    }


    /**
     * 泛型[T]的6种使用：
     * 1、scala的类和方法、函数都可以的使用泛型
     * 泛型类：指定类可以接受任意类型参数
     * 泛型方法：指定方法可以接受任意类型参数
     * 2、泛型可以设置边界： 上边界（<：）,下边界(>:)
     * 3、"<%" :view bounds可以进行某种神秘的转换，把你的类型在没有知觉的情况下转换成目标类型，
     * 其实你可以认为view bounds是上下边界的加强和补充，语法为："<%"，要用到implicit进行隐式转换（见下面例子
     * 4、"T:classTag":相当于动态类型，你使用时传入什么类型就是什么类型，（spark的程序的编译和运行是区分了Driver和Executor的，只有在运
     * 行的时候才知道完整的类型信息）语法为："[T:ClassTag]"下面有列子
     * 5、逆变和协变：-T和+T（下面有具体例子）+T可以传入其子类和本身（与继承关系一至）-T可以传入其父类和本身（与继承的关系相反），
     * 6、"T:Ordering" :表示将T变成Ordering[T],可以直接用其方法进行比大小,可完成排序等工作
     *
     */

    def fanXingTest(): Unit = {

        //    https://www.cnblogs.com/LazyJoJo/p/6410509.html

    }
}

/**
 * 1. 类定义可以有参数，称为类参数，如下面的 xc, yc，类参数在整个类中都可以访问。
 */
class Point(xc: Int, yc: Int) {
    var x: Int = xc
    var y: Int = yc

    def move(dx: Int, dy: Int) {
        x = x + dx
        y = y + dy
        println("x 的坐标点: " + x)
        println("y 的坐标点: " + y)
    }
}

//提取器
object Test {
    def main(args: Array[String]) {
        val x = 32
        println(x)

        x match {
            case Test(num) => println(Test(num) + " 是 " + num + " 的四倍！")
            //unapply 被调用
            case _ => println("无法计算")
        }
        Test(8)
        println("结束！！！！！！！")
    }

    /**
     * 当object写了apply方法，无需重写其伴生类也无需通过new就可以生成对象了，如上的Test(8)
     */
    def apply(x: Int): Int = {
        println("进入了appply")
        val res = x * 4
        println(res)
        res
    }

    /**
     * 当写了unapply方法,则可以进行提取
     */
    def unapply(z: Int): Option[Int] = {
        println("进入了Unappply")
        if (z % 4 == 0) Some(z / 4) else None
    }
}

