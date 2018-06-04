var express = require('express');
var mongoose = require('mongoose');
var MongoClient = require('mongodb').MongoClient;
var bodyParser = require('body-parser');
var path = require('path');
var editing = require('./editing');
var post = require('./post.js');
var getnews = require('./getnews');
var app = express();

// MongoClient.connect('link-to-mongodb', (err, database) => {

// });


app.use(bodyParser.urlencoded({extended: true}));
app.use(express.static('public'));
var fs = require('fs');
var dict;
fs.readFile("users.json", "utf8", function(err, data){
    dict = JSON.parse(data.trim());
});

app.post('/post', (req, res) => {
    var un = req.body['username'];
    var pw = req.body['password'];
    // console.log(un);
    for(key in dict){
        
        if(key == un && dict[key] == pw){
            res.type('text/html');
            res.sendfile('./public/' + 'add.html');
            console.log("valid");

        }
        else{
            
        }
    }
    
});

app.use('/editing', editing);
app.use('/post', post);
app.use('/getnews', getnews);
app.listen(5000, ()=>{
    console.log("node server is running 5000");
});
















