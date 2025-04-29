(ns tengstrand.grid.extract)

(defn within-grid?
  "checks whether an invader is inside a radar image"
  [{radar-width :width
    radar-height :height}
   {invader-width :width
    invader-height :height}
   x y]
  (and (>= x 0)
       (<= (+ invader-width x)
           radar-width)
       (>= y 0)
       (<= (+ invader-height y)
           radar-height)))

(defn extract-row
  "Extracts an invader row from a radar image"
  [row x width]
  (subs row x (+ x width)))

(defn extract-invader
  "Extracts an invader from a radar image.
   The within-grid? is used for the sake of robustness, but could be removed."
  [{radar-grid :grid
    :as radar}
   {invader-width :width
    invader-height :height
    :as invader}
   x y]
  (when (within-grid? radar invader x y)
    {:x x
     :y y
     :width invader-width
     :height invader-height
     :grid (mapv #(extract-row % x invader-width)
                 (take invader-height (drop y radar-grid)))}))

(defn extract-invaders
  "Extracts all possible invaders (rectangles with the same with and height) that fit a radar image"
  [{radar-width :width
    radar-height :height
    :as radar}
   {invader-width :width
    invader-height :height
    :as invader}]
  (for [y (range (- radar-height invader-height))
        x (range (- radar-width invader-width))]
    (extract-invader radar invader x y)))
