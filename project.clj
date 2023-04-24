(defproject migrations "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[[cheshire "5.10.2"]
                  [com.github.seancorfield/next.jdbc "1.2.780"]
                  [integrant "0.8.0"]
                  [metosin/reitit "0.5.18"]
                  [org.clojure/clojure "1.11.1"]
                  [aero "1.1.6"]
                  [org.postgresql/postgresql "42.2.10"]]]
  :repl-options {:init-ns migrations.core})
