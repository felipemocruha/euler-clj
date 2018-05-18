(ns euler-clj.problem22
  (:require [clojure.string :as string]))

(defn compute-scores [names]
  (map (fn [name]
         (->> name
              (map #(- (int %) 64))
              (reduce +)
              (* (+ 1 (.indexOf names name))))) names))

(defn solve []
  (-> (slurp "static/p022_names.txt")
      (string/replace "\"" "")
      (string/split #",")
      sort
      vec
      compute-scores
      (#(reduce + %))))
