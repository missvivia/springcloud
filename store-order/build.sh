#!/bin/bash

# 编译打包
mvn clean install

# 构建镜像
docker build -t store-order .
docker tag store-order yun.rep:5000/store-order
docker push yun.rep:5000/store-order

# 部署到k8s集群
kubectl apply -f store-order.yaml