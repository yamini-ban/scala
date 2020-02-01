package edu.knoldus

class HigherOrderFunctions {

  def areaOfRectangle(length: Int, breadth: Int) = length*breadth

  def areaOfRhombus(diagnol1: Int, diagnol2: Int) = diagnol1*diagnol2/2

  def areaOfParallelogram(base: Int, height: Int) = base*height

  def areaOfMentionedShape(shape: String, first: Int, second: Int, areaOfMentionedShape:(Int, Int) => Int):String =
    shape match {
      case "rectangle" => s"Area of rectangle is ${areaOfRectangle(first, second)}"
      case "rhombus" => s"Area of rhombus is ${areaOfRhombus(first,second)}"
      case "parallelogram" => s"Area of parallelogram is ${areaOfParallelogram(first, second)}"
      case _ => "Please mention shape only among rectangle, rhombus or parallelogram."
    }
}