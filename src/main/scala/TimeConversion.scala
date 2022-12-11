/** * timeConversion ** */
/** https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true */

import java.text.SimpleDateFormat

object TimeConversion {

  def main(args: Array[String]): Unit = {
    timeConversion("07:05:45PM")
    timeConversion("12:45:54PM")
  }

  /** Solution */
  def timeConversion(s: String): String = {
    val inputTimeFormat = new SimpleDateFormat("hh:mm:ssa")
    val timeWithDateFormat = inputTimeFormat.parse(s)
    val outputTimeFormat = new SimpleDateFormat("HH:mm:ss")
    outputTimeFormat.format(timeWithDateFormat).toString
  }

}
