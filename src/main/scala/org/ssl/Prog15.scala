package org.ssl

object Prog15 {

  def main(args: Array[String]): Unit = {

    val ls = List('a, 'b, 'c, 'c, 'd)
    val n = 3
    println(duplicate(n, ls))
  }

  def duplicate[A](n: Int, ls: List[A]): List[A] = {

    ls.flatMap(x => List.fill(n)(x))

  }
}