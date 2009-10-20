package sclex

import scalacl._
import scalacl.ScalaCL._

object ScalaCLExample extends Application {
  val n = 1000
  val prog = new VectAdd(Dim(n))
  prog.a.write(1 to n)
  prog.b.write(1 to n)
  prog !;
  println(prog.output)

  println("a(5): " + prog.a.get(5) + " b(5): " + prog.b.get(5) + " out(5): " + prog.output.get(5))
}

class VectAdd(i: Dim) extends Program(i) {
  val a = FloatsVar
  val b = FloatsVar
  var output = FloatsVar

  content = output := a + b
}
