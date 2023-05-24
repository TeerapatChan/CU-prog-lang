object Question03 {
  def subList(l1:List[Any], l2:List[Any]):Boolean ={
    if (l1.isEmpty) true
    else if (l2.isEmpty) false
    else if (l1.length == 1){
      if (l1.head != l2.head) subList(l1,l2.tail)
      else true
    }
    else subList(List(l1.head), l2) && subList(l1.tail,l2)
  }

  def main(arg: Array[String]): Unit = {
    println(subList(List(0), List(1, 2, 3, 4, 5,6,7,8,9,10)))
    println(subList(List(1), List(1, 2, 3, 4, 5,6,7,8,9,10)))
    println(subList(List(1,8), List(1, 2, 3, 4, 5,6,7,8,9,10)))
    println(subList(List(2,6), List(1, 2, 3, 4, 5,6,7,8,9,10)))
    println(subList(List(1,14), List(1, 2, 3, 4, 5,6,7,8,9,10)))
    println(subList(List(13,2), List(1, 2, 3, 4, 5,6,7,8,9,10)))
  }
}
