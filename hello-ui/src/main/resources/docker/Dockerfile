FROM node:12.4.0-alpine as builder
WORKDIR /app
COPY . /app
RUN npm install && npm run build

FROM node:12.4.0-alpine as runner
WORKDIR /app
COPY --from=builder /app/dist /app
RUN npm install http-server -g
CMD npx --no-install http-server . -p 8080 -a 0.0.0.0



