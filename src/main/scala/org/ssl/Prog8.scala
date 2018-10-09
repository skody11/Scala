package org.ssl

object Prog8 {
  def main(args: Array[String]): Unit = {

    val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'g, 'e, 'e, 'e, 'e, 'g)


    println(compress(l))
    println(l.distinct)

  }

  def compress[A] (symbols: List[A]): List[A] = {
    symbols match{
      case h :: tail => h :: compress(tail.dropWhile(_ == h))
      case Nil => Nil
    }
  }
}
