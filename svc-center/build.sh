#!/bin/bash
docker build -t svc-center .
docker tag svc-center 172.21.20.11:5000/svc-center
docker push 172.21.20.11:5000/svc-center