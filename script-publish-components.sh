#!/bin/bash

docker build -t yevgen2000/frontend-service:1.0 -f frontend/Dockerfile frontend
docker push yevgen2000/frontend-service:1.0

docker build -t yevgen2000/books-service:1.0 -f books/Dockerfile books
docker push yevgen2000/books-service:1.0

docker build -t yevgen2000/authors-service:1.0 -f authors/Dockerfile authors
docker push yevgen2000/authors-service:1.0