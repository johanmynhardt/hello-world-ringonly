(ns hello-world-ringonly.core2
  (:use ring.middleware.params)
  (:use ring.handler.dump))

(defn log-request-info [request]
  (println (str "request             " request)
  (doseq [item (keys request)]
    (println (str "key: " item)))))

(defn log-response [response]
  (println (str "returning response: " response)))

(defn handler [request]
  (cond
    (= "/info" (:uri request)) (handle-dump request)
    :default {:status 404 :body "not found"}))

(def app
  (wrap-params handler))
