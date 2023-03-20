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
kubectl port-forward webapp-deployment-7c8576856-64t5p 5000:5000
```


```
http://localhost:5000/
```

<br/>


## 파드에서 애플리케이션 로그에 액세스

```shell
kubectl logs -f webapp-deployment-7c8576856-64t5p
```


<br/>

## 쿠버네티스 서비스

```shell
kubectl apply -f webapp-service.yaml
```


<br/>

## 서비스 생성 확인

```shell
kubectl describe service webservice
```


<br/>

## 서비스 생성 시 로드밸런서 생성 

```shell
kubectl apply -f webapp-service-loadbalancer.yaml
```

<br/>

## 서비스 생성 시 로드밸런서 생성 확인


```shell
kubectl get service webservice
```

<br/>

## 쿠버네티스의 자가 치유

```shell
kubectl scale --replicas=3 deployment webapp-deployment
```

```shell
kubectl get pods
```

<br/>

## 파드 삭제

```shell
kubectl delete pod webapp-deployment-f58b6c774-z7k8f
```





<br/>
<br/>





---------------------------------------------



<br/>
<br/>

# 마이크로서비스 추가

<br/>


## 애플리케이션 배포



```shell
docker build -t frontend-app:1.0 .
```


```shell
kubectl apply -f frontend-deployment.yaml
```

<br/>

## 파드 프락시 제공

```shell
kubectl port-forward frontend-deployment-5fc86fcd46-q6s8h 8080:8080
```



