package Data_Types

object MyTouple {
  val mytuple = (1,2,"A",3.14,false)
  val mytuple2 = new Tuple4("SS",7.33,"Man",(2,3))

  def main(args: Array[String]): Unit = {
    println(mytuple)
    println(mytuple._3) //data from position 3
    println(mytuple2._4)
    println(mytuple2._4._2)
    println("-----------------")
    mytuple.productIterator.foreach{ //iterate
      value => println(value)
    }
    println("-----------------")
    println(1 -> "jojo" -> 1897) //nested tuple (map notation)
  }
}
