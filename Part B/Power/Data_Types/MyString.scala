package Data_Types

object MyString {
  val s1: String = "Hello there. "
  val s2: String = "General Kenobi"
  val n1 = 66;
  val n2 = 98.45

  def main(args: Array[String]): Unit = {
    println(s1.length())
    println(s1 + s2)
    println(s1.concat(s2))

    printf("%s: Order (%d) ,has been %f percent completed.", s1, n1,n2)
    val result = printf("%s: Order (%d) ,has been %f percent completed.", s1, n1,n2)
    println(result)

    //println("%s: Order (%d) ,has been %f percent completed.".format(s1, n1,n2))


  }
}
