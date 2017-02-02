(ns zero-two-six.core-test
  (:require [clojure.test :refer :all]
            [zero-two-six.core :refer :all]))

(deftest a-test
  (testing "Koan 26, first test."
    (is (= (fib 3) '(1 1 2)))))

(deftest b-test
  (testing "Koan 26, second test."
    (is (= (fib 6) '(1 1 2 3 5 8)))))

(deftest c-test
  (testing "Koan 26, third test."
    (is (= (fib 8) '(1 1 2 3 5 8 13 21)))))
