import java.io.File

import scala.io.Source

object txt {
  def main(args: Array[String]) {

    //    for (line <- Source.fromFile("D:\\scala\\src\\main\\scala\\txt.scala", "UTF-8").getLines()) {
    //      println(line.length + " " + line)
    //    }

    val lines = Source.fromFile("D:\\scala\\src\\main\\scala\\txt.scala", "UTF-8").getLines().toList

    val longestLine = lines.reduceLeft(
      (a, b) => if (a.length > b.length) a else b
    )
    val maxWidth = widthOfLength(longestLine)
    for (line <- lines) {
      val numSpace = maxWidth - widthOfLength(line)
      val padding = " " * numSpace
      println(padding + line.length + "|" + line)
    }
  }

  def widthOfLength(s: String) = s.length.toString.length


}
