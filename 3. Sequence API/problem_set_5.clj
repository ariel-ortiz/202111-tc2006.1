;;-------------------------------------------------------------------
;; Solutions to problems 1, 2 & 5 from problem set #5.
;;-------------------------------------------------------------------

(defn deep-swapper
  [x y lst]
  (let [p (first lst)
        r (rest lst)]
    (cond
      (empty? lst) 
      ()

      (list? p) 
      (cons (deep-swapper x y p)
            (deep-swapper x y r))

      (= x p)
      (cons y (deep-swapper x y r))

      (= y p)
      (cons x (deep-swapper x y r))

      :else
      (cons p (deep-swapper x y r)))))

(defn gcd
  [a b]
  (->> (range (min a b) 0 -1)
       (drop-while #(not (and (zero? (rem a %))
                              (zero? (rem b %)))))  
       (first)))

(defn pack
  [lst]
  (partition-by identity lst))