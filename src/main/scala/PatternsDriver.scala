import org.slf4j.Logger
import org.slf4j.LoggerFactory
import math.{E, Pi}

object PatternsDriver extends App{

val logger = LoggerFactory.getLogger("com.scala.PatternsDriver ")
logger.info("PatternsDriver  starting")
sealed class Expr
case class Var(name:String) extends Expr
case class Number(num:Double) extends Expr
case class UniOp(op:String, expr:Expr) extends Expr
case class BinOp(op:String, left:Expr, right: Expr) extends Expr

val myVar = Var("x")
val myNum = Number(25.4)
val myUniOp = UniOp("-",myVar)
val myBinOp = BinOp("+",myNum,Number(12))

//Pattern Types
/*
//Wildcard pattern
def matchWildcard(a:Any) =a match{
case Some(a) => println("This Option object with some value")
case _       => println("Any object other than Option with some value")
}
matchWildcard(25)
matchWildcard(Some("Hello"))
*/

/*
//constant pattern
//5, "Hello",true,  Singleton Object(Nil etc;)  : These are all constants
val myPi ="TEST"
val myList=List(2,3,4)
def matchConstants(c: Any) =c match{
case 25 => println("This is ineger constant 25")
case "Hello" => println("This is Stringconstant Hello")
case false => println("This is Boolean constant false")
case Nil => println("This is Single Object of Nil")
case Pi =>  println("This is mathematical constant Pi")
case `myPi` => println(s"The value is $myPi")
case `myList` => println(s"The value of list is $myList")
case _ => println("This is wildcard default case")
}
matchConstants(20)
matchConstants(false)
matchConstants(Nil)
matchConstants("Hello")
matchConstants(25)
matchConstants(Pi)
matchConstants(myPi)
matchConstants(myList)

*/

/*
//varalble pattern 

//A variable pattern matches any object, just like a wildcard. Unlike a wildcard, Scala binds the variable to whatever the object is
def matchExprVar(a : Any) = a match {
case "hi" => println("This is String hi")
case someThing => println("The passed variable value is  ="+someThing)

}

println(matchExprVar("Hello"))
println(matchExprVar("Hi"))
println(matchExprVar(21))
println(matchExprVar("hi"))

*/
/*

//Contructor Pattern //Object must be of type CaseClass

def matchExpr(e:Expr) :Expr = e match{
case UniOp(a,b) => b
case _  => Number(2)
}

println(matchExpr(Var("h")))
println(matchExpr(myUniOp))
println("----------")

def matchConstructor(e:Any)  = e match{
case UniOp(a,b) => println(b)
//case String(a)  => println(a)// doesnot  compile as String is not CaseClass
case a:String  => println(a)
case _  => println("Un Matched case")
}

matchConstructor(Var("h"))
matchConstructor(myUniOp)
matchConstructor("HELLO")
*/


/*
//Sequence Pattern
def matchSequence(l :List[String]) =l match{
case List(x,_) => println("List with element x="+x)
case List("a","b") => println("List with two elements a, b ")
case List("JP",_*) => println("List of names starting with JP")
case Nil => println("Empty list")

}
matchSequence(Nil)
matchSequence(List("JP","b"))
*/

/*
//Typed Pattern
def matchType(t:Any) =t match{
case a:String => println("This is String= "+a)
case b:Int => println("This is Int"+b)
case m:Map[_,_] => println("This is map")
case _   => println("Default")

}
matchType("Hello");
matchType(23f);
matchType(23);
matchType(Map("name"->"JP"))
*/

/*
//Type erasure test
def matchType1(t:Any)=t match {
case n:Map[Int,Int] => println("This is Map of type Int-> Int")
case m:Map[String,String] => println("This is Map of type String -> String")
case _  => println("Default")
}
val m =Map("name" -> "JP","phone" -> "12321321")
println(matchType1(m))
*/

/*
//Guarded Pattern
def matchGuardedPattern(a:Any) = a match{
case i:Int if(i%2 ==0) => println("This is even number="+i)
case i:Int if(i%2 ==1) => println("This is oddnumber="+i)
case _ => println("Default")
}
matchGuardedPattern("Hi")
matchGuardedPattern(25)
matchGuardedPattern(24)
*/
/*
//Pattern variable binding  and  usage of @unchecked annotation
var f=Number(5)

def matchExpr1(e:Expr)  = (e: @unchecked) match{

case UniOp(a,f @ Number(c)) =>
             {println(f)
              println(c)
             }
case UniOp(a,_) => println(a)
case n @ Number(_) => println(n)
//case _  => println("default") // removing the default case makes the compiler throw warnings as it is sealed class and cases to match are not exhaustive.
}
matchExpr1(UniOp("+",Number(56)))
matchExpr1(UniOp("-",Var("test")))
matchExpr1(myNum)
println(f)
println("---------")
def matchList(a:Any) =a match{
case List(a @ "hi","hello",_*) => println(a)
case List("hello",_*) =>println("List starting with hello")
case _ => println("Default")
}
matchList(List("hi","hello","nothing"))
*/
/*
//Using Option for matching
def matchOption(p: Option[String]) =p match{
case Some(a) => println("Option with some value"+a)
case b:Option[String] => println("Matching the option type")
case None => println("matching None")
}
val k :Option[String] = Some("JPReddy")

matchOption(k)
matchOption(None)
*/
/*
//Partial Function
val second:List[Int] => Int = { case x::y::_ => y}
val l = List(23,34,45,67,78)
println(second(l))
//second(Nil)
val partialSecond:PartialFunction[List[Int], Int] = { case x::y::_ => y}
println(partialSecond.isDefinedAt(Nil))
println(partialSecond.isDefinedAt(l))
println(partialSecond(l))
*/
//Cases in iterating sequences
val ml = List(Some("jpreddy"),None,Some("Hello"))
for(Some(a) <- ml)
    println(a)
logger.info("PatternsDriver  Ending")


}