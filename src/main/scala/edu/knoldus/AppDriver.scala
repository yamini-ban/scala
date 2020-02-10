package edu.knoldus

import queues.{DoubleQueue, SquareQueue}

import scala.collection.immutable.List

object AppDriver extends App {

  val p1 = new Person("yamini", 23)
  val p2 = new Person("Yamini", 24)

  val p3 = new Person("yamini", 23)
  val p4 = new Person("Yami", 23)

  println(p1 > p2)
  println(p3 > p4)

  val firstName = new FirstName("Yamini")
  val lastName = new LastName("Bansal")
  val age = new Age(23)
  val x = new ValueClassExample
  x.displayDetails(firstName, lastName, age)

  val doubleQueue = new DoubleQueue(List(1,2,3))
  println(doubleQueue.enqueue(doubleQueue.queue, 4))
  println(doubleQueue.dequeue(doubleQueue.queue))

  val squareQueue = new SquareQueue(List(1,2,3,4))
  println(squareQueue.enqueue(squareQueue.queue, 4))
  println(squareQueue.dequeue(squareQueue.queue))



}
