package Data_Types

object MyArray {
  val a: Array[Int] = new Array[Int](10)
  var b = Array(1,2,3,4)  //initializer list

  def main(args: Array[String]): Unit = {
    println(a) //will print address

    for(i <- 0.to(a.length-1)) { // print default values
      print(a(i) + ", ")
    }
    println("------------------------------")
    for(i <- 0.until(a.length)) { // using "to" -> a.length-1
      a(i) = i
    }
    for(i <- 0.until(a.length)) {
      print(a(i) + ", ")
    }
    println("------------------------------")
    for(x <- a){  //for each
      print(x + ", ")
    }

    }
}
