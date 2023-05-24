object Parenthesis {
  def balance(chars: List[Char],open: Int): Boolean = {
    if (chars.isEmpty && open == 0) true
    else if (chars.isEmpty && open != 0) false
    else if (chars.head == '(') balance(chars.tail, open + 1)
    else if (chars.head == ')') balance(chars.tail, open - 1)
    else balance(chars.tail, open)
  }

  def main(args: Array[String]): Unit = {
    println(balance("(())".toList,0))
  }
}