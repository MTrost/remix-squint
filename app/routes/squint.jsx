import { println } from 'squint-cljs/core.js'
import { useLoaderData } from '@remix-run/react';
import { json } from '@remix-run/node';
var loader = function () {
return json(({ "to": "world", "from": "Squint", "date": new Date() }));
};
println("hello");
var Squint = function () {
let data1 = useLoaderData();
return [<h1>Squinting</h1>, <div><p style={({ "color": "red" })}>{data1.from}</p> says hello to <p style={({ "color": "red" })}>{data1.to}</p> on <p style={({ "color": "red" })}>{data1.date}</p></div>];
};
var default$ = Squint;

export { loader, Squint }
export default default$
