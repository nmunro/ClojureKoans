(ns zero-two-nine.core
  (:gen-class))

(defn get-caps [s]
  (apply str (re-seq #"[A-Z]" s)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
