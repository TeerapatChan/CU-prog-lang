object Question06 {
  def myMap(f:Int => Int) (list:List[Int]) :List[Int] = {
    if (list.isEmpty) List()
    else f(list.head) :: myMap(f)(list.tail)

  }

  def main(arg: Array[String]): Unit = {
    println(myMap((x: Int) => x * 2)(List(1, 2, 3, 4, 5)))
    println(myMap((x: Int) => x * x)(List(1, 2, 3, 4, 5)))
  }
}
