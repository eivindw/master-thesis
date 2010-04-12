(defmacro rev [& body]
  (let [rev# (reverse body)]
    `(do ~@rev#)))

(println (macroexpand '(rev (* x y)(def y 4)(def x 3))))

(def result
  (rev
    (* x y)
    (def y 4)
    (def x 3)))

(println (str "Result: " result))
(rev (println 1) (println 2))