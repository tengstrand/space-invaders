(ns tengstrand.grid.creator-test
  (:require [clojure.test :as test :refer :all]
            [tengstrand.grid.creator :as sut]))

(deftest as-grid
  (is (= {:width 11
          :height 8
          :grid ["--o-----o--"
                 "---o---o---"
                 "--ooooooo--"
                 "-oo-ooo-oo-"
                 "ooooooooooo"
                 "o-ooooooo-o"
                 "o-o-----o-o"
                 "---oo-oo---"]}
         (sut/as-grid ["--o-----o--"
                       "---o---o---"
                       "--ooooooo--"
                       "-oo-ooo-oo-"
                       "ooooooooooo"
                       "o-ooooooo-o"
                       "o-o-----o-o"
                       "---oo-oo---"]))))
