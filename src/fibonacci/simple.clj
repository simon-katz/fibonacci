(ns fibonacci.simple)

(defn fib [n]
  (println "calculating fib" n) (flush)
  (condp = n
    0 1
    1 1
    (+ (fib (- n 1))
       (fib (- n 2)))))

(comment
  (fib 6)
  (fib 6))
