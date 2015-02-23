import org.slf4j.Logger
import org.slf4j.LoggerFactory

object ScalaDriver extends App{

val logger = LoggerFactory.getLogger("com.scala.ScalaDriver")
logger.debug("ScalaDriver starting")

def myF(i:Int) :Float ={
  var a:Float = i
  val result = a *a /(2*a)
  result
}
//println(myF(3))
val s1: String  = null
val s2: String  = "check"
val b= (s1 == s2)
println(b)


//multiline string
val foo ="""This is my
                |test for 
              |multiline  string"""
println("multline string test:"+foo.stripMargin)
logger.info("ScalaDriver Ended")
}