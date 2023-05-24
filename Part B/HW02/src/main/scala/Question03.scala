object Question03 {
  def subList(l1:List[Any], l2:List[Any]):Boolean ={
    /*if (l1.isEmpty) true
    else if (l2.isEmpty) false
    else if (l1.length == 1){
      if (l1.head != l2.head) subList(l1,l2.tail)
      else true
    }
    else subList(List(l1.head), l2) && subList(l1.tail,l2)*/
    if (l1.isEmpty) return true
    else if (l2.isEmpty) return false
    else if (l1.head == l2.head) return subList(l1.tail,l2.tail)
    else return subList(l1,l2.tail)
  }

  def main(arg: Array[String]): Unit = {
    println(subList(List(0), List(1, 2, 3, 4, 5,6,7,8,9,10)))
    println(subList(List(1), List(1, 2, 3, 4, 5,6,7,8,9,10)))
    println(subList(List(1,8), List(1, 2, 3, 4, 5,6,7,8,9,10)))
    println(subList(List(2,6), List(1, 2, 3, 4, 5,6,7,8,9,10)))
    println(subList(List(1,14), List(1, 2, 3, 4, 5,6,7,8,9,10)))
    println(subList(List(1,2,4,5,10,11), List(1, 2, 3, 4, 5,6,7,8,9,10)))
  }
}
