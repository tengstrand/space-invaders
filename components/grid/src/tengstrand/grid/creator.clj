(ns tengstrand.grid.creator)

(defn as-grid
  "Converts a radar image or invader to a representation that also includes its width and height."
  [rows]
  (when (not (apply = (map count rows)))
    (throw (Exception. "All rows need to be the same length")))
  {:width (-> rows first count)
   :height (count rows)
   :grid rows})
