const { error, log } = require('console');
const fs = require('fs');

const adata = fs.readdirSync('index.html','utf-8')
// const http = require('http')
// var server = http.createServer((req, res) => {
//   var url = req.url;
//   if (url == '/') {
//     const data = fs.readFile('D:/Tops Technologies/Web Development/classwork/Flipping card/images/index.html', 'utf-8',(err,data)=>{
//         if (err) {
//             console.log(err);
//         }
//         res.writeHead(200,{'content-type':'text/html'});
//         res.write(data);
//         res.end();
//         console.log("Data Fetched");
//     })
//   }
// })

// server.listen(8000,()=>{
//     console.log("Server is listening...");
// });