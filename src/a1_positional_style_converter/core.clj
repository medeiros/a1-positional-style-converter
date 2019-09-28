(ns a1-positional-style-converter.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(def domain "ABCDEFGHIJKLMNOPQRSTUVWXYZ")

(defn convert-a1-to-positional
  "Convert an A1 core to a positional value starting at 0."
  [a1code]
  (loop [i 0
         j (dec (count a1code))
         result 0]
    (if (< i count (a1code))
      (recur (inc i) (dec j)
             (+ result (reduce * (repeat j (count domain)))))
      (do
        (println (str "result: " result))
        result))))
