package org.ssl

import scala.collection.immutable

object Prog9 {
  def main(args: Array[String]): Unit = {

 //   val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'g, 'e, 'e, 'e, 'e, 'g)
 //   val l = List('a, 'a, 'a, 'a)
      val l = List()

    println(pack(l))


  }

  def pack[A](ls: List[A]): List[List[A]] = {
 val(first,last) = ls.span(_ == ls.head)
    if (last == Nil) List(first)
    else{
      first :: pack(last)
    }
//    println(first)
//    println(last)
//    println(List(first,last))
//    println(first :: List(last))
//    Nil
  }

}