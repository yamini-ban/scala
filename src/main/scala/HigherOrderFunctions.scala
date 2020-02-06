val areaOfRectangle = (length: Int, breadth: Int) => length*breadth

val areaOfRhombus = (diagnol1: Int, diagnol2: Int) => (diagnol1*diagnol2 / 2).toDouble

val areaOfParallelogram = (base: Int, height: Int) => base*height

class HigherOrderFunctions {

  def areaOfMentionedShape(shape: String, first: Int, second: Int, areaOfMentionedShape:(Int, Int) => Int):String =
    shape match {
      case "rectangle" => s"Area of rectangle is ${areaOfMentionedShape(first, second)}"
      case "rhombus" => s"Area of rhombus is ${areaOfMentionedShape(first,second)}"
      case "parallelogram" => s"Area of parallelogram is ${areaOfMentionedShape(first, second)}"
      case _ => "Please mention shape only among rectangle, rhombus or parallelogram."
    }
}
