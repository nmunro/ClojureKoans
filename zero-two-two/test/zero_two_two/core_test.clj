(ns zero-two-two.core-test
  (:require [clojure.test :refer :all]
            [zero-two-two.core :refer :all]))

(deftest a-test
  (testing "Koan 22, first test."
    (is (= (c '(1 2 3 3 1)) 5))))

(deftest b-test
  (testing "Koan 22, second test."
    (is (= (c "Hello world") 11))))

(deftest c-test
  (testing "Koan 22, third test."
    (is (= (c [[1 2] [3 4] [5 6]]) 3))))

(deftest d-test
  (testing "Koan 22, fourth test."
    (is (= (c '(13)) 1))))

(deftest e-test
  (testing "Koan 22, fifth test."
    (is (= '(:a :b :c)) 3)))
