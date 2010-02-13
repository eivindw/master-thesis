class ActiveRecord
  def self.has_many(arg)
    name = arg.to_s
    send :define_method, name do
      sql = "select * from #{name} where #{self.class.name.downcase!}_id = #{self.object_id}"
      puts "running sql: #{sql}"
      puts "return new list of #{name} objects"
      className = name.capitalize.chop
      ["eivind", "ola"]
    end
  end
end

class Actual < ActiveRecord
  has_many :things
end

class Thing < ActiveRecord
end

Actual.new.things.each { thing | puts "Thing: #{thing}" }
