object ListExercise {
  def member(x:Any, l:List[Any]): Boolean = {
      if (l.isEmpty) false
      else if (l.head == x) true
      else member(x,l.tail)
  }
  def sorted(l:List[Int]): Boolean = {
    def check(l:List[Int], prev:Int): Boolean = {
      if (l.isEmpty) true
      else if (prev <= l.head) check(l.tail,l.head)
      else false
    }
    check(l.tail,l.head)
  }
  def delete(x:Any,l:List[Any]): List[Any] = {
    /*def f(x:Any,l:List[Any], temp:List[Any]) :List[Any] = {
      if (l.isEmpty) temp
      else if (l.head == x) f(x,l.tail,temp)
      else {
        var toAppend: List[Any] = List(l.head)
        f(x,l.tail,temp++toAppend)
      }
    }
    f(x,l,List())*/
    if (l.isEmpty) List()
    else if (l.head == x) delete(x,l.tail)
    else l.head :: delete(x,l.tail)
  }
  def length(l:List[Any]) : Int = {
    def f(l:List[Any],len:Int) : Int = {
      if (l.isEmpty) len
      else f(l.tail,len+1)
    }
    f(l,0)
  }
  def main(args: Array[String]): Unit = {
    var l: List[Int] = List(1,1,2,3,4,1,5,6)
    println(member(8,l))
    println(sorted(l))
    println(delete(1,l))
    println(length(l))
  }
}
