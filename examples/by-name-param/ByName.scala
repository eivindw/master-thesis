// Class implementing function with a by-name body parameter
class DoIntTimes(val n: Int) {
  def times(body: => Unit) {
    for(i <- 0 until n) body
  }
}

// Implicit conversion from integers to the class defined above
implicit def intToDoIntTimes(n: Int) = new DoIntTimes(n)

// Example of use
2 times {
  println("printed twice!")
}
