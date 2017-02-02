(ns zero-two-four.core-test
  (:require [clojure.test :refer :all]
            [zero-two-four.core :refer :all]))

(deftest a-test
  (testing "Koan 24, first test."
    (is (= (s [1 2 3]) 6))))

(deftest b-test
  (testing "Koan 24, second test."
    (is (= (s (list 0 -2 5 5)) 8))))

(deftest c-test
  (testing "Koan 24, third test."
    (is (= (s #{4 2 1}) 7))))

(deftest d-test
  (testing "Koan 24, fourth test."
    (is (= (s '(0 0 -1)) -1))))

(deftest e-test
  (testing "Koan 24, fifth test."
    (is (= (s '(1 10 3)) 14))))
