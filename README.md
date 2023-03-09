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


