(defproject com.walmartlabs/lacinia-pedestal "0.2.0"
  :description "Pedestal infrastructure supporting Lacinia GraphQL"
  :url "https://github.com/walmartlabs/pedestal-lacinia"
  :license {:name "Apache Software License 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.walmartlabs/lacinia "0.17.0"]
                 [com.fasterxml.jackson.core/jackson-core "2.8.8"]
                 [io.pedestal/pedestal.service "0.5.2"]
                 [io.pedestal/pedestal.jetty "0.5.2"]]
  :profiles
  {:dev {:dependencies [[clj-http "2.0.0"]
                        [io.aviso/logging "0.2.0"]]}}
  :jvm-opts ["-Xmx500m"]
  :plugins [[lein-codox "0.10.3"]
            [test2junit "1.3.0"]
            [lein-shell "0.5.0"]]
  :shell {:dir "resources/graphiql"}
  :prep-tasks [["shell" "./build"]]
  :jar-exclusions [#"graphiql/node_.*"
                   #"graphiql/build"
                   #"graphiql/package.json"
                   #".*/\.DS_Store"]
  :codox {:source-uri "https://github.com/walmartlabs/pedestal-lacinia/blob/master/{filepath}#L{line}"
          :metadata {:doc/format :markdown}})
