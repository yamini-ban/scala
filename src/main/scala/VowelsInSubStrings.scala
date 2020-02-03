package edu.knoldus

class VowelsInSubStrings {

  def isVowel(chr: Char): Boolean = {
    if (chr.toUpper == 'A' || chr.toUpper == 'E' || chr.toUpper == 'I' || chr.toUpper == 'O' || chr.toUpper == 'U') true else false
  }

  def countVowelsInAllSubstrings(str: String, currentIndexOfConsideration: Int, result: Int): Int = {
    val strLen = str.length
    if(currentIndexOfConsideration >= strLen) {
      result
    }
    else {
      val currentChar = str(currentIndexOfConsideration)
      if (isVowel(currentChar)) {
        val noOfCharsAfterCurrent = strLen - currentIndexOfConsideration - 1
        val newResult = result + (currentIndexOfConsideration + 1) * (noOfCharsAfterCurrent + 1)
        countVowelsInAllSubstrings(str, currentIndexOfConsideration + 1, newResult )
      }
      else
        countVowelsInAllSubstrings(str, currentIndexOfConsideration + 1, result)
    }
  }

  def countVowels(str: String): Int = {
    countVowelsInAllSubstrings(str, 0, 0)
  }
}

object AppDriver extends App {
  val vowels = new VowelsInSubStrings()
  println(vowels.countVowels("bacEB"))
  println(vowels.countVowels("aaa"))
}
