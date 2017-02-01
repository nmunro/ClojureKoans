(ns zero-three-nine.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn mix [seq1 seq2]
  (let [len (min (count seq1) (count seq2))]
    (loop [s1 (take len seq1) s2 (take len seq2) lst []]
      (if (empty? s1)
        lst
        (recur (rest s1) (rest s2) (conj (conj lst (first s1)) (first s2)))))))
