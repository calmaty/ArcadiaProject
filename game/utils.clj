(ns game.utils
  (:require [arcadia.core :refer :all]
            [game.moves :as moves]
            [game.cards :as cards]
            [arcadia.linear :as l])
  (:import [UnityEngine Vector3 Resources SpriteRenderer Color UI.Text]))

(defn rat
     [x]
     (do (log x)
       (doall x)
      x))
