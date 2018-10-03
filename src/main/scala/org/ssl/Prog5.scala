package org.ssl

object Prog5 {
  def main(args: Array[String]): Unit = {
  //val l = List(1,2,3,4,5)
    val st = List("hi", "hello", "how")
    println(reverse(st))
  }
  def reverse[A] (args: List[A]): List[A] = {
    args.reverse
  }
}
