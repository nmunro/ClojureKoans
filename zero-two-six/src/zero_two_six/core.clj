(ns zero-two-six.core
  (:gen-class))

(defn fib [limit]
  (loop [prev 0 s []]
    (if (= (count s) limit)
      s
      (if (empty? s)
        (recur 0 (conj s 1))
        (recur (last s) (conj s (+ (last s) prev)))))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
