object Question01 {
  def insertLast(x:Any, l:List[Any]) : List[Any] = {
    l ++ List(x)
  }
  def main(arg: Array[String]): Unit = {
    val l = List(2,3,4,1,2,5)
    println(insertLast(6, l))
  }
}
