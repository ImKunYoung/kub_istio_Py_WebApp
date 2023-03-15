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

<br/>

## 도커 허브 푸시

```shell
docker push web-app
```

<br/>


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

<br/>

## 파드 프락시 제공

```shell
kubectl port-forward webapp-deployment-f58b6c774-z7k8f 5000:5000
```


```
http://localhost:5000/
```

<br/>


## 파드에서 애플리케이션 로그에 액세스

```shell
kubectl logs -f webapp-deployment-f58b6c774-z7k8f
```
