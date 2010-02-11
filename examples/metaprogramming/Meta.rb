class Base
  def self.has_many(arg)
    send :define_method, arg.to_s do
      puts "SQL: select * from #{arg.to_s} where #{self.class.name.downcase!}_id = #{self.object_id}"
    end
  end
end

class Actual < Base
  has_many :things
end

Actual.new.things
