(ns squint
  (:require ["@remix-run/react" :refer [useLoaderData]]
            ["@remix-run/node" :refer [json]]))

;; Remix compiles exported functions named loader
;; to GET endpoints.
(defn loader []
  (json {:to "world"
         :from "Squint"
         :date (new Date)}))
(println "hello")
;; Default export will render inside parent's <Outlet />
(defn- Squint []
  (let [data (useLoaderData)]
    #jsx [[:h1 "Squinting"]
          [:div
           [:p {:style {:color "red"}} data.from] "says hello to"
           [:p {:style {:color "red"}} data.to] "on"
           [:p {:style {:color "red"}} data.date]]]))


(def default Squint)