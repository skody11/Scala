package org.ssl

object Prog8 {
  def main(args: Array[String]): Unit = {

    val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

    println(compress(l))
  }

  def compress[A] (symbols: List[A]): List[A] = {
    symbols reduce {
      case (x,x) => x
      case (x,y) => y
      case _ => Nil
    }
  }
}
