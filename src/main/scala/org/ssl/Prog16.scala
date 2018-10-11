package org.ssl

object Prog16 {

  def main(args: Array[String]): Unit = {

    val ls = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val n = 3
    println(drop(n, ls))
  }

  def drop[A](n: Int, ls: List[A]): List[A] = {

    ls
  }
}
