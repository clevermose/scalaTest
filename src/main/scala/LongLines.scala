import scala.io.Source

/**
  * Created by liuzhuo on 2016/5/18.
  *
  * &lt;一句话功能简述&gt;
  * &lt;功能详细描述&gt;
  *
  * @author liuzhuo
  * @version [版本号, ${date}]
  * @see [相关类/方法]
  * @since [产品/模块版本]
  */

object  LongLines{
  def main(args: Array[String]) {
    processFile("D:\\scala\\scalaTest\\src\\main\\scala\\LongLines.scala",10)

  }

  def processFile(filename:String,width:Int): Unit ={
    def processLine(line:String): Unit ={
      if (line.length > width)
        println(filename+": "+line.trim)
    }

    val source = Source.fromFile(filename)
    for(line <-source.getLines() )
      processLine(line)
  }

}