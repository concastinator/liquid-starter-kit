(defproject autotest "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [mogenslund/liquid "2.0.0"]]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :edit {:main liq.core}}
  :aliases {"edit" ["with-profile" "edit" "run"]})
