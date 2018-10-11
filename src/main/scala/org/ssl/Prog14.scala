package org.ssl

object Prog14 {

  def main(args: Array[String]): Unit = {

  val ls = List('a, 'b, 'c, 'c, 'd)
  println(duplicate(ls))
  }

  def duplicate[A](ls: List[A]): List[A] = {

  if (ls.isEmpty) Nil
    else{
    ls match{

      case h :: tail => h :: h :: duplicate(tail)
      case l :: Nil =>  l :: l :: Nil
    }
  }

  }
}

