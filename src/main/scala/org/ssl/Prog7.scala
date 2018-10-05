package org.ssl

object Prog7 {

  def main(args: Array[String]): Unit ={
    val l = List(List(List(1, 1), 2, List(3, List(5, 8))))
    println(l.flatten)
    print(factorial(5))
  }

    def factorial(i:Int): Int ={
      if (i > 0)
        {
          println(s"In if=$i")
          i * factorial(i - 1)
        }
      else
        {
          println(s"In else=$i")
          1
        }
    }
}
