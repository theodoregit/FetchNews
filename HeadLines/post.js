var express = require('express');
var router = express.Router();
var path = require('path');
var fs = require('fs');

router.get('/', (req, res, next)=>{
    res.send('it works now');
});

router.post('/news', (req, res, next)=>{
    //get textbox of headlines and text area of contents
    var headlines = req.body['headline'];
    var contents = req.body['content'];
    //write on text files
    fs.writeFile('./headlines.txt', headlines, (err)=>{
        if(err) throw err;
        // console.log("headline saved");
    });
    fs.writeFile('./contents.txt', contents, (err)=>{
        if(err) throw err;
        // console.log("content saved");
    });

    //copy the contents of header and news from text files to news.html elements
    
    // res.type('text/html');
    res.sendfile('./public/news.html');
});
router.post('/news/latest', (req, res, next)=>{
    
    // res.type('text/html');
    res.sendfile('./public/news.html');
    
});

module.exports = router;