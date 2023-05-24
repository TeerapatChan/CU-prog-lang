object Question09 {
  def turingStep(f:Char => Char,tape:List[Char], n:Int): List[Char] = {
    def solve(f:Char => Char,tape:List[Char], n:Int, ans:List[Char]): List[Char] = {
      if (n == 0 || tape.isEmpty) return ans ++ tape
      else return solve(f,tape.tail,n-1, ans ++ List(tape.head.toLower))
    }
    return solve(f,tape,n,List())
  }

  def main(args: Array[String]): Unit = {
    var tape = List('C', 'H', 'A', 'R')
    var f1 = ( ch:Char ) => {ch.toLower}
    println(turingStep(f1, tape, 0))
    println(turingStep(f1, tape, 1))
    println(turingStep(f1, tape, 2))
    println(turingStep(f1, tape, 3))
    println(turingStep(f1, tape, 4))
    println(turingStep(f1, tape, 5))
    println(turingStep(f1, tape, 100))
  }
}
