class DoIntTimes(val n: Int) {
  def times(body: => Unit) {
    for(i <- 0 until n) body
  }
}

implicit def intToDoIntTimes(n: Int) = new DoIntTimes(n)

2 times {
  println("printed twice!")
}
