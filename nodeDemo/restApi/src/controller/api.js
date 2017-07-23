module.exports = function (router) {
    router
        .get('/api/trans',
        async ctx => {
            ctx.response.body = 'hello';
            console.log("hello");
        })
        .post('/api/trans',
        async ctx => {
            ctx.response.body = '';
        }
        )
};