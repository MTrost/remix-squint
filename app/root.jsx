import { Links, LiveReload, Meta, Outlet, Scripts, ScrollRestoration } from '@remix-run/react';
var meta = function () {
return ({ "charset": "utf-8", "title": "New Remix App from ClavaScript", "viewport": "width=devide-width,initial-scale=1" });
};
var App = function () {
return <html lang="de"><head><Meta></Meta> <Links></Links></head> <body><Outlet></Outlet> <ScrollRestoration></ScrollRestoration> <Scripts></Scripts> <LiveReload></LiveReload></body></html>;
};
var default$ = App;

export { meta, App }
export default default$
