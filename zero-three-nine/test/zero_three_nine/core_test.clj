(ns zero-three-nine.core-test
  (:require [clojure.test :refer :all]
            [zero-three-nine.core :refer :all]))

(deftest a-test
  (testing "First."
    (is (= (mix [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c)))))

(deftest b-test
  (testing "Second."
    (is (= (mix [1 2] [3 4 5 6]) '(1 3 2 4)))))

(deftest c-test
  (testing "Third."
    (is (= (mix [1 2 3 4] [5]) [1 5]))))

(deftest d-test
  (testing "Fourth."
    (is (= (mix [30 20] [25 15]) [30 25 20 15]))))
