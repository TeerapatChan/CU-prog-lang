package Data_Types

object MySet {
  val s1: Set[String] = Set("Luke","Han","Leia","Luke") //immutable
  var s2 = scala.collection.mutable.Set("Yugi", "Judai", "Yusei") //mutable

  def main(args: Array[String]): Unit = {
    println(s1)
    println(s1 + "PP")  //create a new set

    s2.add("Jojo")       //add data to an existing set
    s2.add("Judai")
    println(s2)

    println(s2("Judai"))  //Since there is no index, this checks for existence.

    println(s2.head)
    println(s2.tail)
    println(s2.isEmpty)

  }
}
