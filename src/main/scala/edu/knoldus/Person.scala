package edu.knoldus

class Person(val name: String, val age: Int) extends Ordered[Person]{
  def compare(that: Person):Int = {
    this.name.toLowerCase compare that.name.toLowerCase match {
      case 0 => this.age compare that.age
      case _ => this.name.length compare that.name.length
    }
  }
}
