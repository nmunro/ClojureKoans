(ns zero-three-one.core-test
  (:require [clojure.test :refer :all]
            [zero-three-one.core :refer :all]))

(deftest a-test
  (testing "Koan 031, test 1."
    (is (= (seq-pack [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3))))))

(deftest b-test
  (testing "Koan 031, test 2."
    (is (= (seq-pack [:a :a :b :b :c]) '((:a :a) (:b :b) (:c))))))

(deftest c-test
  (testing "Koan 031, test 3."
    (is (= (seq-pack [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4]))))))
