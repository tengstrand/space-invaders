(ns tengstrand.detector.interface
  (:require [tengstrand.detector.detect :as detect]))

(defn detect-invaders
  "Returns detected [x y] positions for the two types of invaders, on a radar image"
  [radar-rows]
  (detect/detect-invaders radar-rows))
