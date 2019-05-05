package com.wsk.bigdata.scala

import java.io.{FileNotFoundException, FileReader, IOException}
import java.util.concurrent.ConcurrentHashMap

import scala.util.matching.Regex

object Study {

  def main(args: Array[String]) {

    //    println("hellow word")


    //    println("你好！中国！")
    //    println(msg)


    //    println(msg2)
    //    println(msg3)
    //    println(max(3,5))
    //    println(max1(3,6))
    //    println(max2(3,7))
    //    println(xunhuan(4,5))
    //    shuzu()
    //    objectType
    //        funTest()

    xunhuanceshi()

    //    funTest()
    //    shuzuTest()
    //    CollectionTest()

    //    classObeTest()

    //    println(matchTest(5))

    //    regexTest()
    //    execptionTest()
  }


  /**
    * 变量的申明
    * 1.变量申明必须有值，占位符就是默认值，不然会报错，或者将类修改为抽象类
    * 2.scala的类型推导并不是想象中那么强大，因为变量都是有值的傻子都会推导其类型了
    */
  val msg = "hellow1"
  var msg2: String = "hellow2"
  val msg3: Long = 0
  val msg4: Double = 2
  val msg5: Float = 3.1f


  /*
  *scala 函数定义
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
    return count
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

  //学习

  /**
    * 概念：对象（object）、类（class）、方法、函数、变量
    * 类是对象的抽象
    */



  /**
    * 访问修饰符：public、protected, private le
    * public为默认的访问控制符
    * private修饰的资源只能在 包含了成员定义的类或对象内部可用,
    * private[包名],表示该方法在该包下有效，如private[this],在当前对象内部可被调用
    * protected它只允许保护成员在定义了该成员的的类的子类中被访问
    */

  /**
    * 作用域
    * private[x] 与 protected[x]
    * 这里的x指代某个所属的包、类或单例对象。如果写成private[x],读作"这个成员除了对[…]中的类或[…]
    * 中的包中的类及它们的伴生对像可见外，对其它所有类都是private。
    *
    */


  /**
    * 运算符，同java
    * 算术运算符
    * 关系运算符
    * 逻辑运算符
    * 位运算符
    * 赋值运算符
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
    for (i <- 3.to(10, 2)) {
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
    * 方法与函数（方法与函数本质上没什么大的区别，函数是一个对象是能够直接赋值给变量的，方法必须是def定义）
    * Scala 中的方法跟 Java 的类似，方法是组成类的一部分。
    * Scala 中的函数则是一个完整的对象，Scala 中的函数其实就是继承了 Trait 的类的对象。
    * Scala 中使用 val 语句可以定义函数，def 语句定义方法。
    *
    * 参数调用方式：传值调用（参数秩序计算一次），传名调用（主动调用的方法参数格式为 a：=>类型，每次使用传名调用时，解释器都会计算一次表达式的值）
    * 可变数组：def funcName(args:String*)
    * 高阶函数：Scala 中允许使用高阶函数, 高阶函数可以使用其他函数作为参数，或者使用函数作为输出结果。
    * 内嵌函数：允许在函数内再创建函数，该函数为局部函数
    * 匿名函数：var f = (参数列表) => 函数体
    */
  def funTest(): Unit = {
    //匿名函数的定义
    val f = (x: Int) => x + 3
    println(f(1))

    //高阶函数、
    println(apply(layout, 10))

    // 函数 f 和 值 v 作为参数，而函数 f 又调用了参数 v
    def apply(f: Int => String, v: Int) = f(v)

    def layout[A](x: A) = "[" + x.toString() + "]"

  }

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
    val strings = new Array[String](3)
    strings(0) = "1"
    strings(1) = "1"
    strings(2) = "3"
    for (str <- strings) {
      print(str)
    }

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

  def CollectionTest(): Unit = {
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
    println("Options[T] =" + values1)
    println(values2 == None)

  }

  /**
    * Iterator:迭代器 it 的两个基本操作是 next 和 hasNext。
    */

  /**
    * 类与对象
    * 类：1、重写一个非抽象方法必须使用override修饰符。
    * 2、只有主构造函数才可以往基类的构造函数里写参数。
    * 3、在子类中重写超类的抽象方法
    *
    * 类的单列模式：为了解决scala中无static关键字，而想直接调用摸个某个类的属性或方法的问题
    * 在类的同一个文件中创建 生成一个同名的Object对象，类和它的伴生对象可以互相访问其私有成员。
    * 该同名对象被称之为该类的伴生对象
    */
  def classObeTest(): Unit = {
    val point = new Point(1, 3)
    point.move(1, 1)
  }

  /**
    * 特征：Trait相当于 Java 的抽象类,内部可以有实现的方法也可以有未实现的方法
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
    * 模式匹配：match  case 对应 Java 里的 switch，但是写在选择器表达式之后。即： 选择器 match {备选项}。
    * 使用了case关键字的类定义就是就是样例类(case classes)，样例类是种特殊的类，经过优化以用于模式匹配。
    * 编译器会在自动给case修饰的样例类创建apply和unapply方法，如果自己定义了这两个方法，可以不使用case修饰
    * 而在模式匹配中使用。
    */

  def matchTest(x: Any): Any = x match {
    case "1" => 1
    case y: Int => "this is Scala Int"
    case "3" => 3
    case _ => 9
  }

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
    * 提取器:Extractor，提取器对象：含有Ununapply方法的类或者object
    * 1、Scala 提取器是一个带有unapply方法的对象。unapply方法算是apply方法的反向操作：unapply接受一个对象，
    * 然后从对象中提取值，提取的值通常是用来构造该对象的值。
    * 2、通过 apply 方法我们无需使用 new 操作就可以创建对象。
    * 3、对象的实例化可以通过提取器（默认执行apply方法）完成，如实例中实例一个双倍数字对象
    * 4、match 模式匹配中case 后使用提取对象，如果编译器会将要参与比对的参与传入提取器的Unapply方法，如是咧中那样 case Test(num)
    * 实际时执行 unapply（数值）这个方法，得到num为8，然后。。。(注意被配置的x的类型需要与apply的返回值类型一致)
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
    * 1、scala的类和方法、函数都可以是泛型。java只有类有泛型概念
    * 2、泛型可以设置边界： 上边界（<：）,下边界(>:)
    * 3、"<%" :view bounds可以进行某种神秘的转换，把你的类型在没有知觉的情况下转换成目标类型，
    * 其实你可以认为view bounds是上下边界的加强和补充，语法为："<%"，要用到implicit进行隐式转换（见下面例子
    * 4、"T:classTag":相当于动态类型，你使用时传入什么类型就是什么类型，（spark的程序的编译和运行是区分了Driver和Executor的，只有在运
    * 行的时候才知道完整的类型信息）语法为："[T:ClassTag]"下面有列子
    * 5、逆变和协变：-T和+T（下面有具体例子）+T可以传入其子类和本身（与继承关系一至）-T可以传入其父类和本身（与继承的关系相反），
    * 6、"T:Ordering" :表示将T变成Ordering[T],可以直接用其方法进行比大小,可完成排序等工作
    */

  def fanXingTest(): Unit = {

    //    https://www.cnblogs.com/LazyJoJo/p/6410509.html

  }

  /**
    * 参数为函数：
    *
    * 方法中传递的参数为函数： def funName[T,U](f: Iterator[T] => U ,resHandler: (Int, U) => Unit)={ TODO}
    * 如上：传入两个函数，第一个函数 f 的入参是Iterator[T] 返回是U类型 ，
    * 第二个函数入参是int以及 U类型，无返回。
    *
    */

}

//class
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
      case Test(num) => println(x + " 是 " + num + " 的四倍！")
      //unapply 被调用
      case _ => println("无法计算")
    }

    println("结束！！！！！！！")
  }

  def apply(x: Int): Int = {
    println("进入了appply")
    var res = x * 2
    println(res)
    return res
  }

  def unapply(z: Int): Option[Int] = {
    println("进入了Unappply")
    if (z % 4 == 0) Some(z / 4) else None
  }
}

