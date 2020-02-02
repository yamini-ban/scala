package edu.knoldus

class Person(val name: String, val age: Int) extends Ordered[Person]{
  def compare(that: Person):Int = {
    this.name compare that.name match {
      case 0 => this.age compare that.age
      case _ => this.name.length compare that.name.length
    }
  }
}
