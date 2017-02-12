(ns zero-two-nine.core-test
  (:require [clojure.test :refer :all]
            [zero-two-nine.core :refer :all]))

(deftest a-test
  (testing "Koan 029, test 1."
    (is (= (get-caps "HeLlO, WoRlD!") "HLOWRD"))))

(deftest b-test
  (testing "Koan 029, test 2."
    (is (empty? (get-caps "nothing")))))

(deftest c-test
  (testing "Koan 029, test 3."
    (is (= (get-caps "$#A(*&987Zf)") "AZ"))))
