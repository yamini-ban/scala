val sumOfInts = (leftOperand: Int, rightOperand: Int) => leftOperand + rightOperand

val sumOfSquares = (leftOperand: Int, rightOperand: Int) => (leftOperand*leftOperand) + (rightOperand*rightOperand)

val sumOfCubes = (leftOperand: Int, rightOperand: Int) => (leftOperand*leftOperand*leftOperand) + (rightOperand*rightOperand*rightOperand)

class Sum {
  def sum(mentionedAction:(Int, Int) => Int, leftOperand: Int, rightOperand: Int): Int =
    mentionedAction(leftOperand, rightOperand)
}
