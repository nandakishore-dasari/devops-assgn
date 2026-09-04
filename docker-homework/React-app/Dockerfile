FROM node:22-alpine

WORKDIR /app

COPY package.json .
COPY index.html .
COPY server.js .

EXPOSE 3001

CMD ["node", "server.js"]
