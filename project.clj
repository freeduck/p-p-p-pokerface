(defproject p-p-p-pokerface "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [iloveponies.tests/p-p-p-pokerface "0.1.0-SNAPSHOT"]]
  :profiles {:dev {:plugins [[lein-midje "3.1.1"]
                             [cider/cider-nrepl "0.7.0-SNAPSHOT"]]}})
