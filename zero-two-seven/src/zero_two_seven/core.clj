(ns zero-two-seven.core
  (:gen-class))

(defn pal [ls]
  (= (map (fn [l] l) ls) (reverse ls)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
