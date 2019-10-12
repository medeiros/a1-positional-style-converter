(ns a1-positional-style-converter.core-test
  (:require [clojure.test :refer :all]
            [a1-positional-style-converter.core :refer :all]))

(deftest should-convert-a1-to-positional
  (testing "FAIL: should-convert-a1-to-positional"
    (is (= (convert-a1-to-positional "A") 0))
    (is (= (convert-a1-to-positional "AA") 26))
    (is (= (convert-a1-to-positional "E") 4))
    (is (= (convert-a1-to-positional "A") 0))
    (is (= (convert-a1-to-positional "J") 9))
    (is (= (convert-a1-to-positional "AC") 28))
    (is (= (convert-a1-to-positional "AB") 27))
    (is (= (convert-a1-to-positional "BA") 52)))
    (is (= (convert-a1-to-positional "AAB") 703)))

(deftest should-convert-positional-to-a1
  (testing "FAIL: should-convert-positional-to-a1"
    (is (= (convert-positional-to-a1 0) "A"))
    (is (= (convert-positional-to-a1 26) "AA"))
    (is (= (convert-positional-to-a1 4) "E"))
    (is (= (convert-positional-to-a1 25) "Z"))
    (is (= (convert-positional-to-a1 9) "J"))
    (is (= (convert-positional-to-a1 28) "AC"))
    (is (= (convert-positional-to-a1 27) "AB"))
    (is (= (convert-positional-to-a1 52) "BA"))
    (is (= (convert-positional-to-a1 703) "AAB"))))
