package org.ssl

object Prog9 {
  def main(args: Array[String]): Unit = {

    val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'g, 'e, 'e, 'e, 'e, 'g)


    println(pack(l))


  }

  def pack[A] (symbols: List[A]): List[List[A]] = {
    symbols match{

    }
  }
}