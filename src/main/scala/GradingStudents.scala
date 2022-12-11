/** * gradingStudents ** */
/** https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true */

object GradingStudents {

  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(73, 67, 38, 33, 49)
    gradingStudents(arr)

    val res1: Array[Int] = arr.map(x => if (x > 37 && x % 5 >= 3) x else 0).filter(_ > 0).map(x => if (x % 5 == 3) x + 2 else if (x % 5 == 4) x + 1 else x)
  }

  /** Solution */
  def gradingStudents(grades: Array[Int]): Array[Int] = {
    grades.map(x => if (x > 37) {
      if (x % 5 == 3) x + 2 else if (x % 5 == 4) x + 1 else x
    } else x)
  }


}
