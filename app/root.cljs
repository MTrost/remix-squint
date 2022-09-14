(ns root
  (:require ["@remix-run/react" :refer [Links
                                        LiveReload
                                        Meta
                                        Outlet
                                        Scripts
                                        ScrollRestoration]]))


(defn meta []
  {:charset "utf-8"
   :title "Squinting Remix"
   :viewport "width=devide-width,initial-scale=1"})

(defn App []
  #jsx [:html {:lang "de"}
        [:head
         [Meta]
         [Links]]
        [:body
         {:style {:fontFamily "system-ui, sans-serif"
                  :lineHeight "1.4"}}
         [Outlet]
         [ScrollRestoration]
         [Scripts]
         [LiveReload]]])

(def default App)