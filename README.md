```shell
minikube start
```


```shell
minikube stop
```


```shell
minikube dashboard
```


```shell
eval $(minikube docker-env)
```

```shell
docker build -t web-app:1.0 .
```

## 도커 허브 푸시

```shell
docker push web-app
```


## 애플리케이션 배포

```shell
kubectl apply -f webapp-deployment.yaml
```



```shell
kubectl get deployments
```


```shell
kubectl get replicaset -o wide
```


```shell
kubectl get pods -o wide
```


```shell
kubectl port-forward webapp-deployment-f59b577fc-w4s7g 5000:5000
```