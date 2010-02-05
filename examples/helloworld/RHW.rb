class Greet
  @name

  def initialize(name)
    @name = name
  end

  def salute()
    puts "Hello #@name!"
  end
end

# A Ruby comment
Greet.new("world").salute()
