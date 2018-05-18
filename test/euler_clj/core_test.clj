(ns euler-clj.core-test
  (:require [clojure.test :refer :all]
            [euler-clj.problem22 :as p22]))

(deftest p22-test
  (is (= 871198282 (p22/solve))))
