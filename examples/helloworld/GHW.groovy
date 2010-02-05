class Greet {
  def name

  Greet(who) { name = who }

  def salute() { println "Hello $name!" }
}

// Groovy comments are the same as in Java
new Greet('world').salute()