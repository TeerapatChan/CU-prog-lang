package Data_Types

object MaMap {

  val mymap: Map[Int,String] = Map(1 -> "Kim", 1 -> "John", 2 -> "Ann", 3 -> "May")

  def main(args: Array[String]): Unit = {
    println(mymap)
    println(mymap(2))  // use key to get value
    //println(mymap(0))  // non existing key throws exception
    println(mymap.keys)
    println(mymap.values)
    println(mymap.isEmpty)
    println(mymap.contains(0))

    mymap.keys.foreach{ key =>  //iterate
      println("key = " + key + ", value = " + mymap(key))
    }
  }
}
