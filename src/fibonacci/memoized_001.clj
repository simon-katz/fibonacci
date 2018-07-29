(ns fibonacci.memoized-001)

(declare fib)

(defn fib-no-mem [n]
  (println "calculating fib" n) (flush)
  (condp = n
    0 1
    1 1
    (+ (fib (- n 1))
       (fib (- n 2)))))

(def fib (memoize fib-no-mem))

(comment
  (fib 6)
  (fib 6))