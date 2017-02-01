(ns zero-two-three.core-test
  (:require [clojure.test :refer :all]
            [zero-two-three.core :refer :all]))

(deftest a-test
  (testing "Koan 23, first test."
    (is (= (r [1 2 3 4 5]) [5 4 3 2 1]))))

(deftest b-test
  (testing "Koan 23, second test."
    (is (= (r (sorted-set 5 7 2 7)) '(7 5 2)))))

(deftest c-test
  (testing "Koan 23, third test."
    (is (= (r [[1 2] [3 4] [5 6]]) [[5 6] [3 4] [1 2]]))))
