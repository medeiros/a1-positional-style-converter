(ns a1-positional-style-converter.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn convert-a1-to-positional
  "Convert an A1 core to a positional value starting at 0."
  [c1code]
  (reduce #(* % (* 26 ?))
          (map #(- (int (.charAt c1code %)) 65) (range 0 (count c1code)))))
