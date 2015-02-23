import scala.util.{Try, Success, Failure}

object Test extends App {

  def readTextFile(filename: String): Try[List[String]] = {
    Try(io.Source.fromFile(filename).getLines.toList)
  }

  val filename = "src/main/scala/MyData.txt"
  readTextFile(filename) match {
    case Success(lines) => lines.foreach(println)
    case Failure(f) => println(f)
  }

  def toInt(s: String): Option[Int] = {
  try {
    Some(Integer.parseInt(s.trim))
  } catch {
    case e: Exception => None
  }
 }
 
 val d ="123s"
 toInt(d) match {
 case Some(i) => println(i)
 case None  => println(0);
 }

}