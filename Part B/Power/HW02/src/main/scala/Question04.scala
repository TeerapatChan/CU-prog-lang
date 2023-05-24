object Question04 {
  def mergesort(list: List[Int]):List[Int] ={

    if (list.length <= 1) return list
    var mid = list.length / 2
    /******************************************************************************/
    def divide(l1: List[Int], l2: List[Int], length: Int): (List[Int],List[Int]) = {
      if (length == mid) return Tuple2(l1,l2)
      else return divide(l1.tail,l2 ++ List(l1.head), length+1)
    }
    def merge(l1: List[Int], l2: List[Int], ans: List[Int]): List[Int] = {
      if (l1.isEmpty && l2.isEmpty) return ans
      else if (l1.isEmpty) return ans ++ l2
      else if (l2.isEmpty) return ans ++ l1
      else if (l1.head < l2.head) return merge(l1.tail,l2,ans ++ List(l1.head))
      else return merge(l1,l2.tail,ans ++ List(l2.head))
    }
    /******************************************************************************/
    var (l1,l2) = divide(list, List(), 0)
    return merge(mergesort(l1),mergesort(l2), List())
  }

  def main(arg: Array[String]): Unit = {
    val l = List(1,6,3,4,6,1,6,2,8,9,10,-1)
    println(mergesort(l))
  }
}
