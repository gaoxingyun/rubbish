const router = require('koa-router')();
const importDir = require('import-dir');
const controllers = importDir('./controller');

module.exports = function () {
    Object.keys(controllers).forEach(name => controllers[name](router));
    return router.routes();
}
