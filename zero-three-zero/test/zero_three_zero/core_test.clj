(ns zero-three-zero.core-test
  (:require [clojure.test :refer :all]
            [zero-three-zero.core :refer :all]))

(deftest a-test
  (testing "Koan 030, test 1."
    (is (= (apply str (compress "Leeeeeerrroyyy")) "Leroy"))))

(deftest b-test
  (testing "Koan 030, test 2."
    (is (= (compress [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))))

(deftest c-test
  (testing "Koan 030, test 3."
    (is (= (compress [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2])))))

