(ns zero-two-three.core
  (:gen-class))

; Reversing a list.
(defn r [l]
  (loop [ls l rtn []]
    (if (empty? ls)
      rtn
      (recur (rest ls) (cons (first ls) rtn)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
