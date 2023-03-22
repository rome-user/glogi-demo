(ns demo.logging
  (:require [lambdaisland.glogi :as log]
            [lambdaisland.glogi.console :as console]))

(when ^boolean goog.DEBUG
  (console/install!)
  (log/set-level :glogi/root :trace))
