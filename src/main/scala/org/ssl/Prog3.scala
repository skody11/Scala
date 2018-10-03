package org.ssl

object Prog3 {

  def main(args: Array[String]): Unit = {

  val l = List(1,2,3,4,5,6,7)
   println(nth(2,l))
  }
  def nth[A] (a: Int, b: List[A]): A ={
  b(a-1)
  }

}
