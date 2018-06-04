var express = require('express');
var router = express.Router();
var path = require('path');
var fs = require('fs');

router.get('/head', (req, res, next)=>{
    fs.readFile("./headlines.txt", function(err, data) {
        // console.log("called  " + data);
        res.send(data);
    });
});
router.get('/main', (req, res, next)=>{
    fs.readFile("./contents.txt", function(err, data) {
        // console.log("called  " + data);
        res.send(data);
    });
});


module.exports = router;