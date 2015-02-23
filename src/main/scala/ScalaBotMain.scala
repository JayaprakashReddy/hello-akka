import akka.actor.{Props, ActorSystem}

object ScalaBotMain extends App{
// Create the ‘helloakka’ actor system
val system = ActorSystem("myFirstAkka")
// Create the ‘akkaBot’ actor
//val akkaBot = system.actorOf(Props[ScalaAkkaBot], “akkaBot”)

val akkaBotMaster = system.actorOf(Props[ScalaBotMaster],"akkaBotMaster")
println("ScalaBotMain Actor System was created")

/*
akkaBot ! ScalaAkkaBot.Move(ScalaAkkaBot.FORWARD)
akkaBot ! ScalaAkkaBot.Move(ScalaAkkaBot.BACKWARDS)
akkaBot ! ScalaAkkaBot.Stop

*/
}