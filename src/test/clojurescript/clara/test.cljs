(ns clara.test
  (:require-macros [cljs.test :as test])
  (:require [clara.test-rules :as test-rules]))

(enable-console-print!)

(defmethod cljs.test/report [:cljs.test/default :end-run-tests] [m]
  (if (cljs.test/successful? m)
    (println "Success!")
    (println "FAIL")))

(defn ^:export run []
  (test/run-tests 'clara.test-rules))
