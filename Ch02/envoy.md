# Envoy 구성

```shell
docker --version
```

### Envoy 프락시 알파인 이미지 다운로드
```shell
docker run -it envoyproxy/envoy:v1.21-latest envoy --version
```


[//]: # (### Envoy 프락시 알파인 이미지 다운로드)

[//]: # (```shell)

[//]: # (docker pull envoyproxy/envoy-alpine:v1.21-latest)

[//]: # (```)


```shell
docker run -it envoyproxy/envoy-alpine envoy --version
```


### Envoy 프락시 구성 파일 실행
```shell
docker-compose -f service-envoy.yaml up
```


### 도커 게이트웨이 주소 확인
```shell
docker network inspect bridge
```


### Envoy 실행
```shell
docker run -v %cd%:/envoy-conf -p 80:80 -p 8081:8081 -it envoyproxy/envoy:v1.21-latest envoy -c /envoy-conf/service-envoy.yaml
```
