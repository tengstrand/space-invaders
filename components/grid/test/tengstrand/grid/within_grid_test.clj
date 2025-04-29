(ns tengstrand.grid.within-grid-test
  (:require [clojure.test :refer :all]
            [tengstrand.grid.extract :as sut]))

(deftest radar-image-narrower-width-than-invader
  (= false
     (sut/within-grid? {:width 10}
                       {:width 11}
                       0 0)))

(deftest radar-image-narrower-height-than-invader
  (= false
     (sut/within-grid? {:width 10
                        :height 10}
                       {:width 10
                        :height 11}
                       0 0)))

(deftest invader-outside-left-of-radar-image
  (= false
     (sut/within-grid? {:width 10}
                       {:width 10}
                       -1 0)))

(deftest invader-outside-right-of-radar-image
  (= false
     (sut/within-grid? {:width 10}
                       {:width 10}
                       1 0)))

(deftest invader-outside-top-of-radar-image
  (= false
     (sut/within-grid? {:width 10}
                       {:width 10}
                       0 -1)))

(deftest invader-outside-bottom-of-radar-image
  (= false
     (sut/within-grid? {:width 10
                        :height 10}
                       {:width 10
                        :height 10}
                       0 1)))

(deftest invader-within-radar-image
  (= true
     (sut/within-grid? {:width 10
                        :height 10}
                       {:width 10
                        :height 10}
                       0 0)))
