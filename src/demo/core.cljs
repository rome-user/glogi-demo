(ns demo.core
  (:require [demo.logging]
            [lambdaisland.glogi :as log]))

(defn ^:export init []
  (let [message (js/document.createElement "p")]
    (set! (.-innerText message)
          (if ^boolean goog.DEBUG
            "You are in a development build. Logging is expected."
            (str "You are in a release build.\n"
                 "Check the compiled JS file for traces of log strings.")))
    (js/document.body.appendChild message))
  (log/trace :message "You should not see me in your release build!"))
