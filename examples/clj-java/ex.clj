; Define x as variable
(def x 5)

; Define halfOrSome as function
(defn halfOrSame [n]
  (if (> n 2)
    (/ n 2)
    n))



; Print result of calling function with variable
(println (halfOrSame x))