(ns fibonacci.fib-005-tail-recursive)

(defn fib [n]
  (condp = n
    0 1
    1 1
    (loop [i    2
           prev 1
           this 2]
      (if (= i n)
        this
        (recur (inc i)
               this
               (+' prev this))))))

(comment
  (fib 6)
  (fib 6)
  (fib 16)
  (fib 100)  ; OK
  (fib 1000) ; OK
  (fib 10000) ; OK
  (fib 100000) ; OK
  )
