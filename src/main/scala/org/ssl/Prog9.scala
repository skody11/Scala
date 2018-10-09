import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

  // Complete the jumpingOnClouds function below.
  def jumpingOnClouds(c: Array[Int]): Int = {

    var i = 0
    var n = c.length
    var res = 0
    for{j <- 0 to (n-1)}{
      if((n-i-1) < 2){
        if (c(i+2) == 1){
          i = i + 1
        } else {
          i = i + 2
        }
        res = res + 1
      }
    }
    res
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val c = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = jumpingOnClouds(c)

    printWriter.println(result)

    printWriter.close()
  }
}
