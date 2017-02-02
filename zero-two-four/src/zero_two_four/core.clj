(ns zero-two-four.core
  (:gen-class))

(defn s [nums]
  (loop [total 0 remaining nums]
    (if (empty? remaining)
      total
      (recur (+ (first remaining) total) (rest remaining)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
