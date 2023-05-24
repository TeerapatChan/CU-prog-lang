object Question01 {

  def swapPair(l:List[Int]): List[Int] = {

    return swap(l,List())
  }

  def swap(l: List[Int], acc: List[Int]): List[Int] = {
    if (l.isEmpty) return acc
    else if (l.length >= 2) {
      return swap(l.tail.tail, acc++List(l.tail.head)++List(l.head))
    }
    else return acc ++ List(l.head)
  }
  def main(args: Array[String]): Unit = {
    val list1 = List()
    val list2 = List(22)
    val list3 = List(1, 2, 3)
    val list4 = List(1, 2, 3, 4)
    val list5 = List(1, 2, 3, 4, 5)
    val list6 = List(1, 2, 3, 4, 5, 6)
    val list7 = List(1, 2, 3, 4, 5, 6,7,8,9,10,11)
    println(swapPair(list1) == List())
    println(swapPair(list2) == List(22))
    println(swapPair(list3) == List(2, 1, 3))
    println(swapPair(list4) == List(2, 1, 4, 3))
    println(swapPair(list5) == List(2, 1, 4, 3, 5))
    println(swapPair(list6) == List(2, 1, 4, 3, 6, 5))
  }

}
