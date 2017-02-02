(ns zero-two-five.core-test
  (:require [clojure.test :refer :all]
            [zero-two-five.core :refer :all]))

(deftest a-test
  (testing "Koan 25, first test."
    (is (= (find-odd #{1 2 3 4 5}) '(1 3 5)))))

(deftest b-test
  (testing "Koan 25, second test."
    (is (= (find-odd [4 2 1 6]) '(1)))))

(deftest c-test
  (testing "Koan 25, third test."
    (is (= (find-odd [2 2 4 6]) '()))))

(deftest d-test
  (testing "Koan 25, fourth test."
    (is (= (find-odd [1 1 1 3]) '(1 1 1 3)))))
