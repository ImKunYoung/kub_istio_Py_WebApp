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
kubectl port-forward webapp-deployment-f59b577fc-7vtcm 5000:5000
```