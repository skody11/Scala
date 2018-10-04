package org.ssl

object Prog7 {

  def main(args: Array[String]): Unit ={
    val l = List(List(List(1, 1), 2, List(3, List(5, 8))))
    println(flat(l))
  }

  def flat[A] (li: List[Any]): List[Any] = {

    li flatMap  {
      case i: List[_] => flat(i)
      case e => List(e)
    }
  }
}
