def before = System.currentTimeMillis()
def i = 0
def j = 1
while(i < 10000000)
  i = i + j
def time = System.currentTimeMillis() - before
System.out.println("Groovy time: " + time + "ms")
