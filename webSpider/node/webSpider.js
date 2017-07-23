var sg = require('superagent');
var cheerio = require('cheerio');
var url = require('url');


var firstUrl = "https://www.zhihu.com/";
var urlReg = /^https/;

var questionUrl = /^https:\/\/\/\/www.zhihu.com\/\/question\/\//;

var hrefs = new Set();
var usedHrefs = new Set();
var questionHrefs = new Set();

var find = function(reqUrl){
sg.get(reqUrl).end(function(err,res){
    hrefs.delete(reqUrl);
    usedHrefs.add(reqUrl);

    console.log('request url:' + reqUrl);
    if(err){
        console.log('error to request: ' + reqUrl);
        return false;
    }   
    //console.log(res.text);
    var $ = cheerio.load(res.text);
    $('a').each(
        function(index,element){
           //  console.log(element);
            var bodyUrl = $(element).attr('href');
            if(!bodyUrl){
                 return false;
             }
             var href = url.resolve(reqUrl, bodyUrl);
            // console.log(href);
             if(urlReg.test(href) && !usedHrefs.has(href)){
                 hrefs.add(href);
             }
        }
    );
    //console.log(hrefs);
    //console.log(usedHrefs);

    if(questionUrl.test(reqUrl)){
        questionHrefs.add(reqUrl);
        console.log(questionHrefs);
    }

    
    hrefs.forEach(requrl => find(requrl));
});
}


find(firstUrl);