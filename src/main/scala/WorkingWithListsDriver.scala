import org.slf4j.Logger
import org.slf4j.LoggerFactory

object WorkingWithListsDriver extends App {

val logger = LoggerFactory.getLogger("com.scala.WorkingWithListsDriver")

logger.info("WorkingWithListsDriver  starting")
/*
//List literals
val l1= List("Hello","Hi","How are you?")
val l2= List(2,4,7,9)
val empty= List()
val recurseList = List(l1,l2,"OK")

println(l1)
println(l2)
println(empty)
println(recurseList)
*/
/*
// List type
val l3= List(1,"test")  //List[Any]
val l4= List()     //List[Nothing]
val l5= List("hi","hello")  //List[String]
val l6:List[Any] = l5  //List[Any]  can be assigned with List[String]
println(l3)
println(l4)
println(l5)
println(l6)
*/
/*
//constructing lists
val a1= 1 :: Nil
println(a1)
val a2= 2 ::a1
println(a2)
val a3 = 3:: (4 :: a2)
println(a3)
val a4= 5::6::7::8::Nil
println(a4)
logger.info("WorkingWithListsDriver  exiting")
*/
//Basic operation in lists
val ml = 2::43::21::56::90::42::Nil
println(ml.head)
println(ml.tail)
println(ml.isEmpty)

}