package com.wsk.bigdata.scala

/**
  * _ 占位符 测试
  *
  * 1、通配符。类似Java中的*。如：import scala.math._
  * 2、作为一个整体。:_*，告诉编译器你希望将某个参数当作参数序列处理！例如val s = sum(1 to 5:_*)就是将1 to 5当作参数序列处理。
  * 3、指代一个集合中的每个元素。例如我们要在一个Array a中筛出偶数，并乘以2，可以用以下办法：a.filter(_%2==0).map(2*_)。
  * 4、在元组中访问组员。如：("scala","spark")._2。
  * 5、某一类型的默认值,如声明属性是:var name : String = _。
  * 6、偏应用函数，在将函数赋给变量时，占位， 如： val h=myfun( "1",_) ,其中myfun是函数名
 *  7. 在match case模式匹配中作为全匹配，类似于java default的意思
 *  8. 函数中：若函数的参数只在函数体（右边），有且仅使用一次，参数可以使用下划线_
  */
object _ZhanweiFuTest {

  def main(args: Array[String]): Unit = {

    println(test(1 to 3:_*))

  }

  private def test(ints: Int*): Int ={
    var a : Int = 0
    for(x <- ints){
      a += x
    }
    return a
  }

class test(){
  var name : String = _

}
}
