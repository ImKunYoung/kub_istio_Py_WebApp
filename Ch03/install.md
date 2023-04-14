## Istio 릴리스 다운로드

1. 깃허브에서 ISTIO 설치
```shell
curl -L https://git.io/getLatestIstio | ISTIO_VERSION=1.2.2 sh
```

2. ISTIO 경로 환경변수에 추가
```shell
export PATH=$PWD/istio-1.2.2/bin:$PATH
```






for i in install/kubernetes/helm/istio-init/files/crd*yaml; do kubectl apply -f $i; done















## GKE에 Istio 설치

1. gcloud로 kubectl 설치
```shell
gcloud components install kubectl
```

2. Istio가 설치 가능한 쿠버네티스의 프로젝트 ID와 지역 Region을 설정한다.
```shell
gcloud config set project [PROJECT_ID]
```

```shell
gcloud services enable compute.googleapis.com
```

```shell
gcloud services enable container.googleapis.com
```

```shell
gcloud config set compute/zone asia-northeast2
```

ssd 할당량 늘림
```shell
gcloud compute project-info add-metadata --metadata=compute-quota-override-SSD_TOTAL_GB=1000
```


3. 새 GKE 클러스터를 생성한다.
```shell
gcloud container clusters create istio-installation --machine-type=n1-standard-2 --num-nodes=2


gcloud container clusters create istio-installation --machine-type=n1-standard-2 --num-nodes=1
```


## 설치 확인

```shell
gcloud container clusters get-credentials istio-installation --zone asia-northeast2 --project istio-383006

```


1. Istio 네임스페이스에서 실행 중인 모든 서비스를 찾음
```shell
kubectl get svc -n istio-system
```


2. 모든 파드가 Istio System에서 작동하고 실행 중인지 확인
```shell
kubectl get pods -n istio-system
```


helm repo add istio.io https://storage.googleapis.com/istio-release/releases/1.2.2/charts/