//Scala code for ScalaAkkaBot.scala
import akka.actor.Actor
import ScalaAkkaBot._
class ScalaAkkaBot extends Actor {
var moving: Boolean = false
var direction: Direction = FORWARD

def receive = {
case Move(newDirection) =>
moving = true
direction = newDirection
System.out.println("It is now moving " +direction);
sender ! "hello"
case Stop =>
moving = false
println(s"I stopped moving")
case msg => unhandled(msg)
}

}

// Add the following to the ScalaAkkaBot.scala file
object ScalaAkkaBot {
sealed abstract class Direction
case object FORWARD extends Direction
case object BACKWARDS extends Direction
case object RIGHT extends Direction
case object LEFT extends Direction
case class Move(direction:Direction)
case object Stop
case object GetRobotState
case class RobotState(direction: Direction, moving: Boolean)
}