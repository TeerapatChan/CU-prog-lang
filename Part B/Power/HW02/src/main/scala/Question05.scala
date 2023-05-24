object Question05 {
  def palindrome(list: List[Any]):Boolean = {
    def check(l1:List[Any], l2:List[Any]): Boolean = {
      if (l1.isEmpty && l2.isEmpty) true
      else if (l1.head == l2.head) check(l1.tail,l2.tail)
      else false
    }
    def reverse(list: List[Any]): List[Any] = {
      if (list.isEmpty) List()
      else reverse(list.tail) ++ List(list.head)
    }
    check(list,reverse(list))
  }

  def main(arg: Array[String]): Unit = {
    println(palindrome(List(1,2,3,3,3,2,1)))
    println(palindrome(List('2','2','3')))
    println(palindrome(List(1)))
    println(palindrome(List(1,2,1,2,1,2,1)))
  }
}
