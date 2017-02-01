(ns zero-two-one.core
  (:gen-class))

(defn n [lst num]
  (loop [c 0 l lst]
    (if (= c num) 
      (first l)
      (recur (+ 1 c) (rest l)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
