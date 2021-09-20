package multithreading

import akka.actor.{Actor, ActorSystem, Props}

object SimpleActorExample extends App {

  class SimpleActor extends Actor {
    override def receive: Receive = {
      case m:String => println("String: " + m)
    }
  }

  val system = ActorSystem("SimpleSystem")
  val actor = system.actorOf(Props[SimpleActor], "SimpleActor")

  actor ! "Hi, Erlang/Elixir es mejor pero yo funciono en la Jvm"
}
