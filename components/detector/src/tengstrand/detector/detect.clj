(ns tengstrand.detector.detect
  (:require [tengstrand.grid.interface :as grid]
            [tengstrand.detector.invader :as invader]))

(defn detect-invader
  "Returns detected [x y] positions for a specific invader on a radar image"
  [radar-image invader]
  (map #(select-keys % [:x :y])
       (filter #(= (:grid %)
                   (:grid invader))
               (grid/extract-invaders radar-image invader))))

(defn detect-invaders
  "Returns detected [x y] positions for the two types of invaders, on a radar image"
  [radar-rows]
  (let [radar-image (grid/as-grid radar-rows)]
    (concat (detect-invader radar-image invader/invader1)
            (detect-invader radar-image invader/invader2))))
