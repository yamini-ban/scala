import scala.collection.immutable._

package edu.knoldus {

  trait Queue {
    def enqueue(queue: List[Int], elementToInsert: Int): List[Int]

    def dequeue(queue: List[Int]): List[Int] = {
      queue.slice(1, queue.length)
    }
  }

}
package queues {
  import edu.knoldus.Queue

  class DoubleQueue(val queue: List[Int]) extends Queue {
    override def enqueue(queue: List[Int], elementToInsert: Int): List[Int] = {
      queue ::: List(elementToInsert * 2)
    }
  }

  class SquareQueue(val queue: List[Int]) extends Queue {
    override def enqueue(queue: List[Int], elementToInsert: Int): List[Int] = {
      queue ::: List(elementToInsert * elementToInsert)
    }
  }
}

