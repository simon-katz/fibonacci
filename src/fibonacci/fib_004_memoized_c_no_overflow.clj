(ns fibonacci.fib-004-memoized-c-no-overflow)

(def fib
  (memoize (fn [n]
             (println "calculating fib" n) (flush)
             (condp = n
               0 1
               1 1
               (+' (fib (- n 1))
                   (fib (- n 2)))))))

(comment
  (fib 6)
  (fib 6)
  (fib 16)
  (fib 100)  ; OK
  (fib 1000) ; stack overflow
  )
