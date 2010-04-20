val before = System.currentTimeMillis
var i = 0
val j = 1
while(i < 10000000)
  i = i + j
val time =
  System.currentTimeMillis - before
println("Scala time: " + time + "ms")
