package com.wsk.bigdata.scala

/**
  * match 匹配很强大：scala很多地方会用到
  *
  */
object MatchTest {

  def main(args: Array[String]): Unit = {

    println(String.format("基础模式匹配之配置值1：%s", test1("1").toString))
    println(String.format("基础模式匹配之配置值2：%s", test1("3").toString))
    println(String.format("--------------------------------------------"))
    println(String.format("对类型进行模式匹配1：%s", test2("3").toString))
    println(String.format("对类型进行模式匹配2：%s", test2(false).toString))
    println(String.format("对类型进行模式匹配3：%s", test2()))
    println(String.format("对类型进行模式匹配4：%s", test2(Some(4)).toString))
    println(String.format("对类型进行模式匹配5：%s", test2(Array(1, 2, "3"))))
    println(String.format("--------------------------------------------"))
    println(String.format("对Option进行模式匹配1：%s", test5(Some(3)).toString))
    println(String.format("对Option行模式匹配2：%s", test5(None).toString))
    println(String.format("--------------------------------------------"))
    println(String.format("对正则进行模式匹配1：%s", test6("spark").toString))
    println(String.format("对正则进行模式匹配2：%s", test6("1").toString))
    println(String.format("对正则进行模式匹配3：%s", test6("0").toString))
    println(String.format("--------------------------------------------"))
    println(String.format("对布尔进行模式匹配1：%s", test7(1).toString))
    println(String.format("对布尔进行模式匹配2：%s", test7(6).toString))
    println(String.format("对布尔进行模式匹配3：%s", test7(99).toString))

  }


  //1 基础模式匹配：匹配值
  def test1(a: String): Int = a match {
    case "1" => 1
    case "2" => 0
    case _ => -1
  }

  //2 对类型进行模式匹配
  def test2(x: Any): String = x match {
    case a: String => "字符串类型"
    case b: MatchTest.type => "b:MatchTest.type类型"
    case c: Int => "int类型"
    case d: Boolean => "布尔类型"
    case _ => "其他类型"
  }

  //3对 arrary进行模式匹配
  //  array match{
  //    case Array(value1) => 语句1    // Array只有一个值value1
  //    case Array(变量1,  变量2, 变量3) => 语句2    // Array含有三个元素执行此语句, 并将三个元素分别赋给三个变量
  //    case Array(value1, _*) => 语句3    // 匹配第一个元素为value1的Array, 当然若先匹配到上述情况则不会执行
  //    case _ => 语句4    // 匹配其它情况
  //  }

  //4、对List进行模式匹配
  //  list match{
  //    case value1 :: Nil => 语句1    // 只包含一个value1
  //    case 变量1 :: 变量2 :: 变量3 :: Nil => 语句2    // 包含三个元素
  //    case value1 :: tail => 语句3    // 第一个元素为value1
  //    case _ => 语句4
  //  }

  //5 对Option进行模式匹配、
  def test5(x: Option[Any]): Int = {
    x match {
      case Some(z) => 1
      case none => 0
    }
  }

  //6对正则进行模式匹配
  def test6(x: String): String = {
    val Pattern = "(s.*)".r
    val v1 = x;
    val r = v1 match {
      case Pattern(v1) => "begin s*"
      case "1" => "1"
      case "2" => "2"
      case _ => "default"
    }
    r
  }

  //7 布尔匹配
  def test7(x: Int): String = x match {
    case a if (1 until 5).contains(a) => "1：" + a.toString
    case a if (5 until 10).contains(a) => "2：" + a.toString
    case a => "3： " + a.toString
  }
}
