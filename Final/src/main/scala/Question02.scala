object Question02 {
  def partialMap(l: List[String])(f1: String => String)(f2: String => Boolean): List[String] = {
    val ch = check(l,f2,List())
    solve(l,ch,List(),f1)
  }
  def check(l:List[String],f2: String => Boolean, acc :List[Boolean]): List[Boolean] = {
    if (l.isEmpty) return acc
    else if (f2(l.head)) return check(l.tail,f2,acc++List(true))
    return check(l.tail,f2,acc++List(false))
  }

  def solve(l1:List[String], l2:List[Boolean], acc:List[String], f1: String => String) : List[String] = {
    if (l2.isEmpty) return acc
    else if (l2.head == true) return solve(l1.tail,l2.tail,acc ++ List(f1(l1.head)),f1)
    return solve(l1.tail,l2.tail,acc ++ List(l1.head),f1)
  }
  def main(args: Array[String]): Unit = {
    val list1 = List()
    val list2 = List("2a")
    val list3 = List("1", "baby", "2", "3", "shark")
    val list4 = List("anya", "yor", "loid", "franky")

    def fChange1(x: String): String = {
      return x + "yy"
    }

    def fChange2(x: String): String = {
      return x + "punch"
    }

    def cond1(s: String): Boolean = {
      return s.length == 1
    }

    def cond2(s: String): Boolean = {
      return s.length >= 4
    }

    def cond3(s: String): Boolean = {
      return s.contains("a")
    }

    def cond4(s: String): Boolean = {
      return !s.contains("a")
    }

    val p1 = partialMap(list1)(fChange1)(_) //empty list and "yy"
    val p2 = partialMap(list2)(fChange1)(_) // one data and "yy"
    val p3 = partialMap(list3)(fChange2)(_)
    val p4 = partialMap(list4)(fChange2)(_)
    println(p1(cond1) == List())
    println(p2(cond1) == List("2a"))
    println(p2(cond3) == List("2ayy"))
    println(p3(cond1) == List("1punch", "baby", "2punch", "3punch", "shark"))
    println(p3(cond3) == List("1", "babypunch", "2", "3", "sharkpunch"))
    println(p4(cond2) == List("anyapunch", "yor", "loidpunch", "frankypunch"))
    println(p4(cond4) == List("anya", "yorpunch", "loidpunch", "franky"))
    //println(solve(list4,cond3,List()))
  }
}