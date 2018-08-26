#!/bin/bash

# 编译打包
mvn clean install

# 构建镜像
docker build -t svc-center .
docker tag svc-center yun.rep:5000/svc-center
docker push yun.rep:5000/svc-center

# 部署到k8s集群
kubectl apply -f eureka01.yaml
kubectl apply -f eureka02.yaml
kubectl apply -f eureka03.yaml