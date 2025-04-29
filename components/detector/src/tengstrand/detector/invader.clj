(ns tengstrand.detector.invader
  (:require [tengstrand.grid.interface :as grid]))

(def invader1 (grid/as-grid ["--o-----o--"
                             "---o---o---"
                             "--ooooooo--"
                             "-oo-ooo-oo-"
                             "ooooooooooo"
                             "o-ooooooo-o"
                             "o-o-----o-o"
                             "---oo-oo---"]))

(def invader2 (grid/as-grid ["---oo---"
                             "--oooo--"
                             "-oooooo-"
                             "oo-oo-oo"
                             "oooooooo"
                             "--o--o--"
                             "-o-oo-o-"
                             "o-o--o-o"]))
