#!/bin/bash

kubectl delete deployments authors-v1
kubectl delete deployments books-v1
kubectl delete deployments frontend-v1

kubectl apply -f frontend/deployment/deployment.yml
kubectl apply -f books/deployment/deployment.yml
kubectl apply -f authors/deployment/deployment.yml