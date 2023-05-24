package Data_Types
import Array._
object MyArray02 {

  val ar1 = Array("Luke","Han","Leia")
  val ar2 = Array("Yugi", "Judai", "Yusei")

  def main(args: Array[String]): Unit = {
    val c = concat(ar1,ar2)
    for(x <- c){  //for each
      print(x + ", ")
    }
  }
}
