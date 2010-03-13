; Example inspired by "Programming Clojure"

; Slow function
(defn slow-double [n]
  (Thread/sleep 100)
  (* n 2))
; Memoized version of slow function
(def mem-double (memoize slow-double))

; Timing the two functions over a vector of values
(def values [1 2 1 2 1 2])
(print "(slow-double) ")
(time (dorun (map slow-double values)))
(print "(mem-double) ")
(time (dorun (map mem-double values)))