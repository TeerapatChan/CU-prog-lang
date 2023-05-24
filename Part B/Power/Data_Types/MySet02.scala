package Data_Types

object MySet02 {
  val s1: Set[String] = Set("Luke","Han","Leia","Luke") //immutable
  var s2 = scala.collection.mutable.Set("Vader", "Luke", "Chewy","Han") //mutable

  def main(args: Array[String]): Unit = {
    println(s1 ++ s2) //union into new set ===> s1.++(s2)
    println(s1.&(s2)) //intersect into new set ===> s1.intersect(s2)
    println(s1.max)   // max value
    println(s1.diff(s2)) //difference into new set
    println("---------------")
    s2.foreach(println) //for loop of a set
    println("---------------")
    for(x <- s2){       //normal foreach
      println(x)
    }
  }
}
