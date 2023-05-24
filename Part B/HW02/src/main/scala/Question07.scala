object Question07 {
  def myFilter(f:Int => Boolean) (list:List[Int]) :List[Int] = {

  }

  def main(arg: Array[String]): Unit = {
    println(myFilter((x: Int) => x % 2 == 0)(List(1, 2, 3, 4, 5, 6)))
    println(myFilter((x: Int) => x > 3)(List(1, 2, 3, 4, 5, 6)))
  }
}
