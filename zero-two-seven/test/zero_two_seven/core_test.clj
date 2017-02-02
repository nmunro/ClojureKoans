(ns zero-two-seven.core-test
  (:require [clojure.test :refer :all]
            [zero-two-seven.core :refer :all]))

(deftest a-test
  (testing "Koan 27, first test."
    (is (= (false? (pal '(1 2 3 4 5)))))))

(deftest b-test
  (testing "Koan 27, second test."
    (is (= (true? (pal "racecar"))))))

(deftest c-test
  (testing "Koan 27, third test."
    (is (= (true? (pal [:foo :bar :foo]))))))

(deftest d-test
  (testing "Koan 27, fourth test."
    (is (= (true? (pal '(1 1 3 3 1 1)))))))

(deftest e-test
  (testing "Koan 27, fifth test."
    (is (= (false? (pal '(:a :b :c)))))))
