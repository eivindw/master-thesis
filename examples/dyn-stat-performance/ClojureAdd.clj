(def j 1)
(print "Clojure ")
(time
  (dotimes [i 10000000]
    (+ (int i) (int j))))
