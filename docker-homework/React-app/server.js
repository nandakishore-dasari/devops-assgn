const http = require('http');
const fs = require('fs');

const port = 3001;

const server = http.createServer((req, res) => {
    res.writeHead(200, { 'Content-Type': 'text/html' });
    res.end(fs.readFileSync('index.html'));
});

server.listen(port, '0.0.0.0', () => {
    console.log(`React app running on port ${port}`);
});
