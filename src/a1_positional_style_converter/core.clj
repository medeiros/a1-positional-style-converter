(ns a1-positional-style-converter.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn convert-a1-to-positional
  "Convert an A1 core to a positional value starting at 0."
  [c1code]
  (dec(reduce +
              (map #(int (* %1 (Math/pow 26 %2)))
                   (into [] (map #(- (int (.charAt % 0)) 64) (clojure.string/split c1code #"")))
                   (into [] (reverse (range 0 (count c1code))))))))