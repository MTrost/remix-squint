(ns app.routes.index
  (:require ["@remix-run/react" :refer [Link]]))

(defn Index []
  #jsx [[:div
         [:h1 "Welcome Remix-Squint!"]
         [:ul
          [:li
           [:a {:target "blank"
                :href "https://remix.run/tutorials/blog"
                :rel "noreferrer"}
            "15m Quickstart Blog Tutorial"]]
          [:li
           [:a {:target "blank"
                :href "https://remix.run/tutorials/jokes"
                :rel "noreferrer"}
            "Deep Dive Jokes App Tutorial"]]
          [:li
           [:a {:target "blank"
                :href "https://remix.run/docs"
                :rel "noreferrer"}
            "Remix Docs"]]]]
        [:div
         [:ul
          "Just a link for client side Navigation"
          [:li
           [Link {:to "/squint"}
            "squinting"]]]]]
  )

(def default Index)