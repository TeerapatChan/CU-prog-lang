package Data_Types

object MyOption2 {
  val l1 = List(1,2,3)
  val opt1: Option[Int] = None
  val opt2: Option[Int] = Some(2)

  def findPos(v:Int, l:List[Int]): Option[Int] ={
    return findPos(v,l,0)
  }

  def findPos(v:Int, l:List[Int], count: Int):Option[Int] ={
    if(l.isEmpty) return None
    if(v == l.head) return Some(count)
    else {
      return findPos(v,l.tail,count+1)
    }
  }

  def main(args: Array[String]): Unit = {
    println(opt1.isEmpty)
    println(opt1.getOrElse("NO"))
    println(findPos(2,l1))
    println(findPos(4,l1))
  }
}
