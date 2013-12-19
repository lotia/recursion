(ns recursion)

(defn product [coll]
  (if (empty? coll)
    1
    (* (first coll) (product (rest coll)))))

(defn singleton? [coll]
  (and
   (not (empty? coll))
   (empty? (rest coll))))

(defn my-last [coll]
  (cond
   (empty? coll) nil
   (singleton? coll) (first coll)
   :else (my-last (rest coll))))

(defn max-element [a-seq]
  (cond
   (empty? a-seq) nil
   (singleton? a-seq) (first a-seq)
   :else (max (first a-seq) (max-element (rest a-seq)))))

(defn seq-max [seq-1 seq-2]
  (if (<= (count seq-1) (count seq-2))
    seq-2
    seq-1))

(defn longest-sequence [a-seq]
  (cond
   (empty? a-seq) nil
   (singleton? a-seq) (first a-seq)
   :else (seq-max (first a-seq) (longest-sequence (rest a-seq)))))

(defn my-filter [pred? a-seq]
  (let [first-elem (first a-seq)
        rest-seq (rest a-seq)]
    (cond
     (empty? a-seq) ()
     (pred? first-elem) (cons first-elem (my-filter pred? rest-seq))
     :else (my-filter pred? rest-seq))))

(defn sequence-contains? [elem a-seq]
  (cond
   (empty? a-seq) false
   (= elem (first  a-seq)) true
   :else (sequence-contains? elem (rest a-seq))))

(defn my-take-while [pred? a-seq]
  (let [first-elem (first a-seq)
        rest-seq (rest a-seq)]
    (cond
     (empty? a-seq) ()
     (pred? first-elem) (cons first-elem (my-take-while pred? rest-seq))
     :else ())))

(defn my-drop-while [pred? a-seq]
  (let [first-elem (first a-seq)
        rest-seq (rest a-seq)]
    (cond
     (empty? a-seq) ()
     (pred? first-elem) (my-drop-while pred? rest-seq)
     :else (seq a-seq))))

(defn seq= [a-seq b-seq]
  (let [first-a (first a-seq)
        rest-a (rest a-seq)
        first-b (first b-seq)
        rest-b (rest b-seq)]
    (cond
     (and (empty? a-seq) (empty? b-seq)) true
     (and (empty? a-seq) (not (empty? b-seq))) false
     (and (not (empty? a-seq)) (empty? b-seq)) false
     (= first-a first-b) (seq= rest-a rest-b)
     :else false)))

(defn my-map [f seq-1 seq-2]
  (let [first-1 (first seq-1)
        rest-1 (rest seq-1)
        first-2 (first seq-2)
        rest-2 (rest seq-2)]
    (if (or (empty? seq-1) (empty? seq-2))
      ()
      (cons (f first-1 first-2) (my-map f rest-1 rest-2)))))

(defn power [n k]
  (if (== k 0)
    1
    (* n (power n (dec k)))))

(defn fib [n]
  (cond
   (== n 0) 0
   (== n 1) 1
   :else (+ (fib (- n 1)) (fib (- n 2)))))

(defn my-repeat [how-many-times what-to-repeat]
  [:-])

(defn my-range [up-to]
  [:-])

(defn tails [a-seq]
  [:-])

(defn inits [a-seq]
  [:-])

(defn rotations [a-seq]
  [:-])

(defn my-frequencies-helper [freqs a-seq]
  [:-])

(defn my-frequencies [a-seq]
  [:-])

(defn un-frequencies [a-map]
  [:-])

(defn my-take [n coll]
  [:-])

(defn my-drop [n coll]
  [:-])

(defn halve [a-seq]
  [:-])

(defn seq-merge [a-seq b-seq]
  [:-])

(defn merge-sort [a-seq]
  [:-])

(defn split-into-monotonics [a-seq]
  [:-])

(defn permutations [a-set]
  [:-])

(defn powerset [a-set]
  [:-])
