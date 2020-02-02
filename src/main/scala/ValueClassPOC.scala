package edu.knoldus

class FirstName(val firstName: String) extends AnyVal {
  override def toString: String = s"${firstName}"
}

class LastName(val lastName: String) extends AnyVal {
  override def toString: String = s"${lastName} is of"
}

class Age(val age: Int) extends AnyVal {
  override def toString: String = s"${age} years"
}

class ValueClassExample {
  def displayDetails(firstName: FirstName, lastName: LastName, age: Age):String= s"${firstName} ${lastName} ${age}"
}
