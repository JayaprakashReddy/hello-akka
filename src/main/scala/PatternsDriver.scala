import org.slf4j.Logger
import org.slf4j.LoggerFactory

object PatternsDriver extends App{

val logger = LoggerFactory.getLogger("com.scala.PatternsDriver ")
logger.info("PatternsDriver  starting")
class Expr
case class Var(name:String) extends Expr
case class Number(num:Double) extends Expr
case class UniOp(op:String, expr:Expr) extends Expr
case class BinOp(op:String, left:Expr, right: Expr) extends Expr

val myVar = Var("x")
val myNum = Number(25.4)
val myUniOp = UniOp("-",myVar)
val myBinOp = BinOp("+",myNum,Number(12))
/*Pattern Types
1.Contructor Pattern
*/
/*
// Constructor matching
def matchExpr(e:Expr) :Expr = e match{

case UniOp(a,b) => b
case _  => Number(2)
}

println(matchExpr(Var("h")))
println(matchExpr(myUniOp))

*/

/*
//Pattern variable binding
var f=Number(5)

def matchExpr1(e:Expr)  = e match{

case UniOp(a,f @ Number(c)) =>
             {println(f)
              println(c)
             }
case UniOp(a,_) => println(a)
case n @ Number(_) => println(n)
case _  => println("default")
}
matchExpr1(UniOp("+",Number(56)))
matchExpr1(UniOp("-",Var("test")))
matchExpr1(myNum)
println(f)

*/
logger.info("PatternsDriver  Ending")


}