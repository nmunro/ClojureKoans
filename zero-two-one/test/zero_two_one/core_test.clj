(ns zero-two-one.core-test
  (:require [clojure.test :refer :all]
            [zero-two-one.core :refer :all]))

(deftest a-test
  (testing "Koan 21, first test."
    (is (= (n '(4 5 6 7) 2) 6))))

(deftest b-test
  (testing "Koan 21, second test."
    (is (= (n [:a :b :c] 0) :a))))

(deftest c-test
  (testing "Koan 21, third test."
    (is (= (n [1 2 3 4] 1) 2))))

(deftest d-test
  (testing "Koan 21, fourth test."
    (is (= (n '([1 2] [3 4] [5 6]) 2) [5 6]))))
