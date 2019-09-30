(ns a1-positional-style-converter.core-test
  (:require [clojure.test :refer :all]
            [a1-positional-style-converter.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= (convert-a1-to-positional "A") 0))
    (is (= (convert-a1-to-positional "AA") 26))
    (is (= (convert-a1-to-positional "E") 4))
    (is (= (convert-a1-to-positional "A") 0))
    (is (= (convert-a1-to-positional "J") 9))
    (is (= (convert-a1-to-positional "AC") 28))
    (is (= (convert-a1-to-positional "AB") 27))
    (is (= (convert-a1-to-positional "BA") 52))))
