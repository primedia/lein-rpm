(defproject lein-rpm "0.0.7"
  :description "Create an RPM"
  :url "https://github.com/rentpath/lein-rpm"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.codehaus.mojo/rpm-maven-plugin "2.1.5"]
                 [clj-yaml "0.4.0"]
                 [org.clojure/java.data "0.1.1"]]
  :eval-in-leiningen true
  :plugins [[lein-pprint "1.1.1"]]
  :repositories [["releases" {:url "http://nexus.idg.primedia.com/nexus/content/repositories/primedia"
                              :sign-releases false
                              :username [:gpg :env/nexus_username]
                              :password [:gpg :env/nexus_password]}]
                 ["snapshots" {:url "http://nexus.idg.primedia.com/nexus/content/repositories/snapshots"
                               :sign-releases false}]])
