import { Link } from '@remix-run/react';
var Index = function () {
return [<div><h1>Welcome Remix-Squint!</h1> <ul><li><a target="blank" href="https://remix.run/tutorials/blog" rel="noreferrer">15m Quickstart Blog Tutorial</a></li> <li><a target="blank" href="https://remix.run/tutorials/jokes" rel="noreferrer">Deep Dive Jokes App Tutorial</a></li> <li><a target="blank" href="https://remix.run/docs" rel="noreferrer">Remix Docs</a></li></ul></div>, <div><ul>Just a link for client side Navigation <li><Link to="/squint">squinting</Link></li></ul></div>];
};
var default$ = Index;

export { Index }
export default default$
