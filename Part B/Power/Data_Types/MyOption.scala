package Data_Types

object MyOption {
  val l1 = List(1,2,3)
  val m1 = Map(1 -> "One", 2 -> "Two")
  def main(args: Array[String]): Unit = {
    println(l1.find(_ >1)) //if there is an answer, give the first answer, otherwise return None
    println(l1.find(_ >1).get)
    println(l1.find(_ >3))

    println(m1.get(1))
    println(m1.get(1).get)
    println(m1.get(0))
    println(m1.get(0).getOrElse("No value found"))

  }
}
