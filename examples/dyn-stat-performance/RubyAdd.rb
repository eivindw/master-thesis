before = Time.new
i = 0
j = 1
while i < 10000000 do
  i = i + j
end
time =
  ((Time.new - before)*1000).round
puts("JRuby time: #{time.to_s}ms")
