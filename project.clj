(defproject hello-world-ringonly "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [ring/ring-devel "1.4.0"]
                 [ring/ring-core "1.4.0"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [com.google.code.gson/gson "2.2.4"]]
  :plugins [[lein-ring "0.9.6"]]
  :ring {:handler hello-world-ringonly.core2/app}
  :main hello-world-ringonly.core)
