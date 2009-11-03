class Base(val name: String)

trait StdOp { self: Base =>
  def std { println("std() running.." + name) }
}

trait ExtraOp { self: Base =>
  def extra { println("extra() running.." + name) }
}

val base = new Base("Test!") with StdOp with ExtraOp
base.std
base.extra
