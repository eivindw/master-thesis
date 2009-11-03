class Base {
  String name;
}

class StdOp {
  def std() {
    println("std() running.." + name);
  }
}

class ExtraOp {
  def extra() {
    println("extra() running.." + name);
  }
}

Base.class.mixin(StdOp, ExtraOp);

base = new Base(name: 'Test!');
base.std();
base.extra();
