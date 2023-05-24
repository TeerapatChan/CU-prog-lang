object Pascal {
  def pascal(r: Int,c:Int): Int = {
    if (c == 0 || r == c) 1
    else pascal(r-1,c-1)+pascal(r-1,c)
  }

  def main(args: Array[String]): Unit = {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(row, col) + " ")
      println()
    }
  }
}
