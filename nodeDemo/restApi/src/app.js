const koa = require('koa');
const router = require('./router');
const bodyParser = require('koa-bodyparser');
const config = require('./config').config;

const app = new koa();
const port = config.port;

app
    .use(async (ctx, next) => {
        await next();
    })
    .use(bodyParser())
    .use(router())
    .listen(port);

console.log(`server listen on ${port} start !`);