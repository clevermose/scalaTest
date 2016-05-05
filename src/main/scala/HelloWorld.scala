import java.math.BigInteger

//import scala.collection.mutable.Map

/**
  * Created by liuzhuo on 2016/4/28.
  *
  * &lt;一句话功能简述&gt;
  * &lt;功能详细描述&gt;
  *
  * @author liuzhuo
  * @version [版本号, ${date}]
  * @see [相关类/方法]
  * @since [产品/模块版本]
  */

object HelloWorld {
  def main(args: Array[String]) {
    //       args.foreach(arg=>print(arg+"\t"))
    //       args.foreach(println)
    //       for(arg <- args) println(arg)
    val big = new Integer("123");
    val greetStrings = new Array[String](3)
    greetStrings(0) = "hello"
    greetStrings(1) = ","
    greetStrings(2) = String.valueOf(big)
    greetStrings.foreach(println)
    println("-----------------------------")

    val oneTwo = List(1, 2);
    val threeFour = List(3, 4);
    val oneTwoTrheeFour = oneTwo ::: threeFour
    println(oneTwo + "and" + threeFour + "were not mutated")
    println("Thus: " + oneTwoTrheeFour + "is a new List")
    println("-----------------------------")

    val pair = (99, "元组")
    println(pair._1)
    println(pair._2)
    println("-----------------------------")

    var jetSet = Set("xiaoming", "xiaohong")
    jetSet += "xiaoli"
    println(jetSet.contains("xiaoli"))

    println("-----------------------------")
    var treasureMap = Map[Int, String]()
    treasureMap += (1 -> "Go to island")
    treasureMap += (2 -> "Find X")
    treasureMap += (3 -> "Dig")
    println(treasureMap(2))
    println("-----------------------------")

    val romanMap = Map(1->'a',2->123,3->"c")
    println(romanMap(2))

  }
}
