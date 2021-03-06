(ns fibonacci.fib-001-simple)

(defn fib [n]
  (println "calculating fib" n) (flush)
  (condp = n
    0 1
    1 1
    (+ (fib (- n 1))
       (fib (- n 2)))))

(comment
  (fib 6)
  (fib 6)
  (fib 16) ; takes a few seconds
  ;; (fib 100) ; don't even try this
  )
