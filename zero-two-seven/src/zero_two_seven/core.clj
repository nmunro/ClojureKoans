(ns zero-two-seven.core
  (:gen-class))

(defn pal [ls]
  ; Need to use cons
  (loop [old-list ls new-list []]
    (if (empty? old-list)
      (if (= new-list ls)
        true
        false)
      (recur (rest old-list) (cons (first old-list) new-list)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
