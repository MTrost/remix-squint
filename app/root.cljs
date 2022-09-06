(ns root
  (:require ["@remix-run/react" :refer [Links
                                        LiveReload
                                        Meta
                                        Outlet
                                        Scripts
                                        ScrollRestoration]]))

(defn meta []
  {:charset "utf-8"
   :title "New Remix App from ClavaScript"
   :viewport "width=devide-width,initial-scale=1"})

(defn App []
  #jsx [:html {:lang "de"}
        [:head
         [Meta]
         [Links]]
        [:body
         [Outlet]
         [ScrollRestoration]
         [Scripts]
         [LiveReload]]])

(def default App)