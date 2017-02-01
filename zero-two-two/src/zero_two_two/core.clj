(ns zero-two-two.core
  (:gen-class))

; This is basically a means to implement a count function.
(defn c [lst]
  (loop [counter 0 l lst]
    (if (empty? l)
      counter
      (recur (+ 1 counter) (rest l)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
