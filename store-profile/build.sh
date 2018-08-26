#!/bin/bash

# 编译打包
mvn clean install

# 构建镜像
docker build -t store-profile .
docker tag store-profile yun.rep:5000/store-profile
docker push yun.rep:5000/store-profile

# 部署到k8s集群
kubectl apply -f store-profile.yaml