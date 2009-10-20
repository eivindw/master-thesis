import scala.util.parsing.combinator._ 

class Arith extends JavaTokenParsers { 
  def expr: Parser[Any] = term~rep("+"~term | "-"~term) 
  def term: Parser[Any] = factor~rep("*"~factor | "/"~factor) 
  def factor: Parser[Any] = floatingPointNumber | "("~expr~")" 
}

object CombinatorParsing extends Application {
  val parser = new Arith
  val expr = "2 + (4 * 5)"
  println("Parse '" + expr + "': " + parser.parseAll(parser.expr, expr))
}
