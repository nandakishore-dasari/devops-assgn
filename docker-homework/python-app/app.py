from http.server import BaseHTTPRequestHandler, HTTPServer

class HelloHandler(BaseHTTPRequestHandler):
    def do_GET(self):
        self.send_response(200)
        self.send_header("Content-type", "text/html")
        self.end_headers()

        html = """
        <html>
        <head><title>Python Hello World</title></head>
        <body>
            <h1>Hello World from Python!</h1>
            <p>This application is running inside a Docker container.</p>
        </body>
        </html>
        """

        self.wfile.write(html.encode())

server = HTTPServer(("0.0.0.0", 5000), HelloHandler)
print("Python server running on port 5000")
server.serve_forever()
