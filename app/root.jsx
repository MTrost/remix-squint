import { Links, LiveReload, Meta, Outlet, Scripts, ScrollRestoration } from '@remix-run/react';
var meta = function () {
return ({ "charset": "utf-8", "title": "Squinting Remix", "viewport": "width=devide-width,initial-scale=1" });
};
var App = function () {
return <html lang="de"><head><Meta></Meta> <Links></Links></head> <body style={({ "fontFamily": "system-ui, sans-serif", "lineHeight": "1.4" })}><Outlet></Outlet> <ScrollRestoration></ScrollRestoration> <Scripts></Scripts> <LiveReload></LiveReload></body></html>;
};
var default$ = App;

export { meta, App }
export default default$
