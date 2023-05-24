package Data_Types

object MyMap02 {
  val m1: Map[Int,String] = Map(1 -> "John", 2 -> "Ann", 3 -> "May")
  val m2 = Map(2 -> "Kim", 4 -> "Lee", 1 -> "Ann", 5 -> "Penguin")


  def main(args: Array[String]): Unit = {
    println(m1 ++ m2) // concat
    println(m1.head)
    println(m1.tail)
    println(m1.size)

  }
}
