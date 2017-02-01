(ns zero-four-zero.core
  (:gen-class))

(defn ipose [sep items]
  (loop [is items lst []]
    (if (= (count is) 1)
      (conj lst (first is))
      (recur (rest is) (conj lst (first is) sep)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
