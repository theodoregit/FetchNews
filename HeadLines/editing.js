var express = require('express');
var router = express.Router();
var path = require('path');
var bodyParser = require('body-parser');

router.use(express.static(path.join(__dirname, 'public')));
router.use(bodyParser.json());


router.post('editing/post', (req, res, next)=>{
    console.log("worked");
    res.type('text/html');
    res.sendfile('./public/' + 'add.html');    
});


module.exports = router;