(defn Index []
  #jsx [:div {:style { :fontFamily "system-ui, sans-serif"
                      :lineHeight "1.4" }}
        [:h1 "Welcome to Remix"]
        [:ul
         [:li
          [a {:target "blank"
              :href "https://remix.run/tutorials/blog"
              :rel "noreferrer"}
           "15m Quickstart Blog Tutorial"]]
         [:li
          [a {:target "blank"
              :href "https://remix.run/tutorials/jokes"
              :rel "noreferrer"}
           "Deep Dive Jokes App Tutorial"]]
         [:li
          [a {:target "blank"
              :href "https://remix.run/docs"
              :rel "noreferrer"}
           "Remix Docs"]]]])

(def default Index)