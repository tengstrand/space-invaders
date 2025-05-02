(ns tengstrand.grid.interface
  (:require [tengstrand.grid.extract :as extract]
            [tengstrand.grid.creator :as creator]))

(defn as-grid
  "Converts a radar image or invader to a representation that also includes its width and height."
  [rows]
  (creator/as-grid rows))

(defn extract-invaders
  "Extracts all possible invaders (rectangles with the same with and height) that fit a radar image"
  [radar-image invader]
  (extract/extract-invaders radar-image invader))
