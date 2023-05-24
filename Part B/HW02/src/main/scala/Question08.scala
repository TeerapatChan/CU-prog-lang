object Question08 {
  def sumAll(lists:List[List[Int]]) :List[Int] = {
    if (lists.isEmpty) return List()

    def findMaxLength(list: List[List[Int]], ans: Int): Int = {
      if (list.isEmpty) return ans
      if (list.head.length > ans) {
        return findMaxLength(list.tail, list.head.length)
      }
      return findMaxLength(list.tail, ans)
    }

    def findVal(list: List[List[Int]], ans: Int): Int = {
      if (list.isEmpty) return ans
      else {
        if (list.head.length == 0) return findVal(list.tail, ans)
        return findVal(list.tail, ans + list.head.head)
      }
    }

    def popFirst(list: List[List[Int]], ans: List[List[Int]]): List[List[Int]] = {
      if (list.isEmpty) return ans
      else if (list.head.isEmpty) return popFirst(list.tail, ans)
      else return popFirst(list.tail, ans ++ List(list.head.tail))
    }

    def getAns(list: List[List[Int]], ans: List[Int], check: Int, maxLength: Int): List[Int] = {
      if (check == maxLength) return ans
      else {
        return getAns(popFirst(list, List()),
          ans ++ List(findVal(list, 0)),
          check + 1, maxLength)
      }
    }
    return getAns(lists,List(),0,findMaxLength(lists,0))
  }

  def main(arg: Array[String]): Unit = {
    println(sumAll(List()))
    println(sumAll(List(List())))
    println(sumAll(List(List(),List(),List())))
    println(sumAll(List(List(1, 2, 3, 4), List(), List(4, 5), List(1, 2, 3, 4, 5, 6))))
    println(sumAll(List(List(3, 4), List(1, 2, 3, 4, 5, 6), List(1, 2, 3, 4))))
    println(sumAll(List(List(1, 2, 3, 4, 5, 6), List(1, 2, 3, 4), List(1, 2), List(0, 0, 0, 0, 0, 0, 0, 0, 9))))
    println(sumAll(List(List(1,1,1,1,1,1,1,1), List(1), List(1,1,1), List(), List(1,1,1,1,1), List(1,1,1,1,1))))
    //List()
    //List()
    //List(6, 9, 6, 8, 5, 6)
    //List(5, 8, 6, 8, 5, 6)
    //List(3, 6, 6, 8, 5, 6, 0, 0, 9)
  }
}
