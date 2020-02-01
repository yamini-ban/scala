package edu.knoldus

class Sum {

  def sumOfInts(leftOperand: Int, rightOperand: Int): Int = leftOperand + rightOperand

  def sumOfSquares(leftOperand: Int, rightOperand: Int): Int = (leftOperand*leftOperand) + (rightOperand*rightOperand)

  def sumOfCubes(leftOperand: Int, rightOperand: Int): Int = (leftOperand*leftOperand*leftOperand) + (rightOperand*rightOperand*rightOperand)

  def sum(mentionedAction:(Int, Int) => Int, leftOperand: Int, rightOperand: Int): Int =
    mentionedAction(leftOperand, rightOperand)
}