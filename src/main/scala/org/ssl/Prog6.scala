package org.ssl

object Prog6 {

  def main(args: Array[String]): Unit = {
    val l = List(1,2,3,2,1)
  println(palindrome(l))
  }

  def palindrome[A] (a: List[A]): Boolean = {

    if (a.reverse == a)
    {
      true
    }
    else {
      false
    }
  }
}
