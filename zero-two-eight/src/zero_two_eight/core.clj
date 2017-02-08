(ns zero-two-eight.core
  (:gen-class))

(defn flat [lst]
  (loop [current-list lst new-list []]
    (if (empty? current-list)
      new-list
      (if (sequential? (first current-list))
        (recur (into (rest current-list) (reverse (first current-list))) new-list)
        (recur (rest current-list) (conj new-list (first current-list)))))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
