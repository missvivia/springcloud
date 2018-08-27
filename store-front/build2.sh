#!/bin/bash

# 编译打包
mvn clean install

# 构建镜像
docker build -t store-front .
docker tag store-front yun.rep:5000/store-front
docker push yun.rep:5000/store-front

# 部署到k8s集群
kubectl apply -f store-front2.yaml