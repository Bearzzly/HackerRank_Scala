/*** birthdayCakeCandles ***/
/**  https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true */

object BirthdayCakeCandles {

  def main(args:Array[String]):Unit = {
    val arr: Array[Int] = Array(3, 2, 1, 3)
    val grpValue: Map[Boolean, Array[Int]] = arr.groupBy(x => x == arr.max)
    val maxValue: Array[Int] = grpValue(true)
    arr.count(_ == arr.max)

    println(birthdayCakeCandles(arr))
  }

  def birthdayCakeCandles(candles: Array[Int]): Int = {
    val maxSize = candles.max
    candles.count(_ == maxSize)
  }

}
