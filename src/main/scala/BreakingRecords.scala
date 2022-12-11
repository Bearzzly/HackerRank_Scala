/** * breakingRecords ** */
/** https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true */

object BreakingRecords {

  def main(args: Array[String]): Unit = {
    val scores = Array(10, 5, 20, 20, 4, 5, 2, 25, 1)
    val res = Array(0, 0)
    val Mm = Array(scores(0), scores(0))
    scores.foreach(x => if (x > Mm(0)) {
      Mm(0) = x
      res(0) += 1
    } else if (x < Mm(1)) {
      Mm(1) = x
      res(1) += 1
    }
    )
    res
    Mm
  }

  /** Solution */
  def breakingRecords(scores: Array[Int]): Array[Int] = {
    val res = Array(0, 0)
    val Mm = Array(scores(0), scores(0))
    scores.foreach(x => if (x > Mm(0)) {
      Mm(0) = x
      res(0) += 1
    } else if (x < Mm(1)) {
      Mm(1) = x
      res(1) += 1
    }
    )
    res
  }
}
