import akka.actor.{Props, Actor}

class ScalaBotMaster extends Actor {
    
import ScalaBotMaster._
import ScalaAkkaBot._

for (indx <- 1 to 10) {
val akkaBot =context.actorOf(Props[ScalaAkkaBot])

akkaBot ! ScalaAkkaBot.Move(ScalaAkkaBot.FORWARD)
akkaBot ! ScalaAkkaBot.Move(ScalaAkkaBot.BACKWARDS)
akkaBot ! ScalaAkkaBot.Stop
}

def receive = {
case StartChildBots =>
context.children.foreach { child =>
println(s"child=$child")
child ! Move(FORWARD)
}
println("Master has started children bots.")
}

}

object ScalaBotMaster {
case object StartChildBots
}