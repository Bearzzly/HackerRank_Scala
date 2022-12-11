/** * kangaroo ** */
/** https://www.hackerrank.com/challenges/kangaroo/problem?isFullScreen=true */

object Kangaroo {

  def main(args: Array[String]): Unit = {
    val x1 = 0
    val v1 = 2
    val x2 = 5
    val v2 = 3

    val range: Seq[Int] = 0 to 1000
    var res = 0

    range.foreach(x => if ((x * v1) + x1 == (x * v2) + x2) res += 1)
    if (res > 0) println("YES")
    else println("NO")
  }

  /** Solution */
  def kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String = {
    val range = 0 to 100000
    var res = 0

    range.foreach(x => if ((x * v1) + x1 == (x * v2) + x2) res += 1)
    if (res > 0) "YES"
    else "NO"
  }


}