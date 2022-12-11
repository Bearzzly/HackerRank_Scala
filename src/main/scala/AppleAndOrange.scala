/** * countApplesAndOranges ** */
/** https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true */
object AppleAndOrange {

  def main(args: Array[String]): Unit = {
    val s = 7
    val t = 11
    val a = 5
    val b = 15
    val apples: Array[Int] = Array(-2, 2, 1)
    val oranges: Array[Int] = Array(5, -6)

    apples.count(x => (x + a) >= s && (x + a) <= t)
    oranges.count(x => (x + b) >= s && (x + b) <= t)
    countApplesAndOranges(s, t, a, b, apples, oranges)
  }

  /** Solution */
  def countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array[Int], oranges: Array[Int]) {
    println(apples.count(x => (x + a) >= s && (x + a) <= t))
    println(oranges.count(x => (x + b) >= s && (x + b) <= t))
  }
}
