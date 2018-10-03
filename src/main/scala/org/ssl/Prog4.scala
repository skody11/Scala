package org.ssl

object Prog4 {
  def main(args: Array[String]): Unit = {
    val l = List(1,2,3,4,5)
    println(length(l))
  }

  def length[A](ints: List[A]): Int = {
    ints.length
  }
}
