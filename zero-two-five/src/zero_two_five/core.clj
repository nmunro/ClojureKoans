(ns zero-two-five.core
  (:gen-class))

(defn find-odd [nums]
  (loop [remaining nums new-nums []]
    (if (empty? remaining)
      new-nums
      (if (odd? (first remaining))
        (recur (rest remaining) (conj new-nums (first remaining)))
        (recur (rest remaining) new-nums)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
