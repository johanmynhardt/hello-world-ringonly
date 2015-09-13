(ns hello-world-ringonly.core
  (:require [ring.adapter.jetty :as jetty]))

(def message "Hello World...")

(defn handler [request]
  {:status 200
   :headers {}
   :body message})

(defn -main []
  (jetty/run-jetty handler {:port 8080}))
