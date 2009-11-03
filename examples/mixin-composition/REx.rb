class Base
  @name
  
  def initialize(name)
    @name = name
  end
end

module StdOp
  def std
    puts "std() running.." + @name
  end
end

module ExtraOp
  def extra
    puts "extra() running.." + @name
  end
end

class MyBase < Base
  include StdOp, ExtraOp
end

base = MyBase.new("Test!")
base.std()
base.extra()

