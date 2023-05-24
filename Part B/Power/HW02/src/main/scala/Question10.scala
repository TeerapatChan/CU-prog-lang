object Question10 {
  def alternate(f1: (Int, Int) => Int, f2: (Int, Int) => Int, list: List[Int]): Int = {
    if (list.length == 0) return 0
    else if (list.length == 1) return list.head
    var ans = f1(list.head,list.tail.head)

    def solve(l: List[Int], idx:Int, ans:Int): Int = {
      if (idx == list.length-1) return ans
      if (idx % 2 == 0) return solve(l.tail, idx+1, f1(ans,l.head))
      else return solve(l.tail, idx+1, f2(ans,l.head))
    }
    solve(list.tail.tail,1,ans)
  }

  def main(args: Array[String]): Unit = {
    println(alternate(_+_, _-_, List())) //ได้ผลลัพธ์เป็น0
    println(alternate(_+_, _-_, List(55))) //ได้ผลลัพธ์55
    println(alternate(_+_, _-_, List(1, 2))) //ได้ผลลัพธ์ = 1 + 2 = 3
    println(alternate(_+_, _-_, List(1, 2, 3))) //ได้ผลลัพธ์ = 1 + 2 - 3 = 0
    println(alternate(_+_, _-_, List(1, 2, 3, 4)))//ได้ผลลัพธ์ = 1 + 2 - 3 + 4 = 4
    println(alternate(_+_, _-_, List(0,0,0)))
    println(alternate(_+_, _*_, List(1,2,5,1,4)))
    println(alternate(_+_, _-_, List(10,9,8,7,6,5,4,3,2,1)))
    println(alternate(_+_, _-_, List(3,2,1)))
  }
  }
