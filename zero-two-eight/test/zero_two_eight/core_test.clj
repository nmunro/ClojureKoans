(ns zero-two-eight.core-test
  (:require [clojure.test :refer :all]
            [zero-two-eight.core :refer :all]))

(deftest a-test
  (testing "Koan 028, test one."
    (is (= (flat '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)))))

(deftest b-test
  (testing "Koan 028, test two."
    (is (= (flat ["a" ["b"] "c"]) '("a" "b" "c")))))

(deftest c-test
  (testing "Koan 028, test three."
    (is (= (flat '((((:a))))) '(:a)))))
