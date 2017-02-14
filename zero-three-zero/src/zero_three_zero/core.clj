(ns zero-three-zero.core
  (:gen-class))

(defn compress [s]
  (loop [prev nil old-list s new-list []]
    (if (empty? old-list)
      new-list
      (if-not (= (first old-list) prev)
        (recur (first old-list) (rest old-list) (conj new-list (first old-list)))
        (recur (first old-list) (rest old-list) new-list)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
