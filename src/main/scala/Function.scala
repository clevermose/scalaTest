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
object  Function{
  def main(args: Array[String]) {
    println("=============================")
    val someNumbers = List(-10,-5,0,5,10)

    println(someNumbers.filter(x=>x>=0))
    println("=============================")

    println(someNumbers.filter(_<=0))
    println("=============================")

    someNumbers.foreach(println _)
    println("=============================")

    def sum(a:Int,b:Int,c:Int)=a+b+c
    val a = sum _
    println(a(1,2,3))
    println("=============================")

    def makeIncreaser(more:Int)=(x:Int) => x+more
    val inc1 = makeIncreaser(1)
    println(inc1(10))
    println("=============================")

    def echo(ss:String*)=for (s <- ss) println(s)
    echo()
    echo("one")
    echo("hello","world")
    val arr = Array("I","AM","SPUER")
    echo(arr:_*)
    println("=============================")

  }
}