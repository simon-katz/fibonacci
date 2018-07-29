(defproject fibonacci "0.1.0-SNAPSHOT"
  :description "Playing with Fibonacci sequence algorithms"
  :url "https://github.com/simon-katz/fibonacci"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [[midje "1.9.1"
                                   :exclusions [org.clojure/clojure]]
                                  [nomis-clj-repl-tools "0.1.2"]]
                   :plugins [[lein-midje "3.2.1"]]}}
  :repl-options {:init-ns user})
