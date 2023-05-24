object Question02 {
  def insertInOrder(x:Int, list:List[Int]) :List[Int] = {
    if (list.isEmpty) List(x)
    else if (list.head < x) list.head :: insertInOrder(x, list.tail)
    else x :: list
  }
  def main(arg: Array[String]): Unit = {
    val l = List(1, 2, 3, 4, 4, 4, 5, 6, 7)
    println(insertInOrder(3, l))
  }
}
