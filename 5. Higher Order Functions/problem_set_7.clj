;;-------------------------------------------------------------------
;; Solutions to problems 1, 2 & 3 from problem set #7.
;;-------------------------------------------------------------------

(defn argswap
  [f]
  (fn [x y]
    (f y x)))

(defn there-exists-one
  [pred lst]
  (= 1 (count (filter pred lst))))

(defn linear-search
  [vct x eq-fun]
  (loop [index 0]
    (cond
      (= index (count vct)) nil
      (eq-fun x (vct index)) index
      :else (recur (inc index)))))
