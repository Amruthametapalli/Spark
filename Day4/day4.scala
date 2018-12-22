//Because Scala automatically decides the data type we dont need a return type or assign a variable to return value

def gradeMyScore(score: Int) = {
  
  if (score >= 90) {
    "A"
  }
  else if (score >= 80) {
   "B"
  }
  else if (score >= 70) {
    "C"
  }
  else if (score >= 60) {
    "D"
  }
  else {
    "E"
  }
  
}

//Using Pattern Matching

def gradeMyScore(score: Int): String = {

  score match {
    case x1 if (score >= 90) => "A"
    case x2 if (score >= 80) => "B"
    case x3 if (score >= 70) => "C"
    case x4 if (score >= 60) => "D"
    case _ => "E"
  }
  
}

//Some and None in Options

val getTodaysWeather : Option[Nothing] = None
val getTodaysDay : Option[String] = Some("Monday")

//List Operations

val genderData = List(
  (1,"smith", "john", "john.smith@gmail.com", 1, None),
  (2,"smith", "kate", "kate.smith@gmail.com", 2, Some("female")))

//Method to Filter the list
def getEmailsForMissingGendervalue(list : List[(Int, String, String, String, Int, Option[String])])  = {
  list.filter(_._6 == None)
}

//Testing the method

assert(getEmailsForMissingGendervalue (genderData).length == genderData.count(_._6 == None),"Error")

//Case class in Scala

case class Address (
  city : String, postalcode : String, street : String, apt : Option[Int]
)

case class Person (
  id : Int, firstName: String, lastName:String, email : String,city : String, gender : Option[Char]
)

//creating a variable of class type
var address1 = Address ("sfo","94086","aster ave",None)
var address2 = Address ("sunnyvale","94056","Arquesvave",None)

//Method to find no of people in a city

def findPersonIn(city: String, people: Seq[Person]): Set[Person] = {
 people.filter(_.city == city).toSet
}

//Testing the method

assert (findPersonIn("sunnyvale",persons).size == persons.count(_.city == "sunnyvale"), "Error")

