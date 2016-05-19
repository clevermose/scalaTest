import java.io.File

/**
  * Created by liuzhuo on 2016/5/19.
  *
  * &lt;一句话功能简述&gt;
  * &lt;功能详细描述&gt;
  *
  * @author liuzhuo
  * @version [版本号, ${date}]
  * @see [相关类/方法]
  * @since [产品/模块版本]
  */
object FileMatcher{
  private def filesHere = (new File(".")).listFiles()
  def filesEnding(query:String)=
  for(file<-filesHere;if file.getName.endsWith(query))
    yield file
}