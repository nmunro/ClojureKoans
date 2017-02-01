(ns zero-four-zero.core-test
  (:require [clojure.test :refer :all]
            [zero-four-zero.core :refer :all]))

(deftest a-test
  (testing "Koan 040, first test."
    (is (= (ipose 0 [1 2 3]) [1 0 2 0 3]))))

(deftest b-test
  (testing "Koan 040, second test."
    (is (= (apply str (ipose ", " ["one" "two" "three"])) "one, two, three"))))

(deftest c-test
  (testing "Koan 040, third test."
    (is (= (ipose :z [:a :b :c :d]) [:a :z :b :z :c :z :d]))))

