(ns a1-positional-style-converter.core
  (:gen-class))

(defn convert-a1-to-positional
  "Convert an A1 code to a positional value starting at 0."
  [c1code]
  (dec (reduce +
               (map #(int (* %1 (Math/pow 26 %2)))
                    (into [] (map #(- (int (.charAt % 0)) 64) (clojure.string/split c1code #"")))
                    (into [] (reverse (range 0 (count c1code))))))))

(defn convert-positional-to-a1
  [pos]
  (loop [x pos
         l []]
    (if (< x 26)
      (clojure.string/join (map char (map #(+ % 65) (cons x l))))
      (recur (dec (int (/ x 26))) (cons (rem x 26) l)))))

(defn -main [& args]
  (if (empty? args)
    (println "params: [pos|a1] [pos value|a1 value]")
    (let [type (nth args 0)
          param (nth args 1)]
      (case type
        "pos" (println (convert-positional-to-a1 (Integer/parseInt param)))
        "a1" (println (convert-a1-to-positional param))))))
