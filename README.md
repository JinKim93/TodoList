# TodoList

### 코드작성 후 항상 ctrl + a 후 ctrl+alt+i(인덴트) ctrl + alt + o(import 최적화) 해주자 


### 프로젝트 세팅 
- 프로젝트관리 툴 -> Grale 선택 
### Gradle Maven 차이 정리
### plugins 추가
### dependencies 추가 -> 의존성라이브러리 추가

### 1. dependencies 에 있는거 삭제 후 추가

![image](https://user-images.githubusercontent.com/82345970/187355454-99528260-e18a-4c94-9bdb-ed0bbbcfbc3e.png)

### 2. 추가
![image](https://user-images.githubusercontent.com/82345970/187355927-42273086-a238-4e2d-a02b-ca2a4b6cf80b.png)

```java
plugins {
    id 'org.springframework.boot' version '2.4.2'
    id 'io.spring.dependency-management' version '1.0.11.RELEASE'
    id 'java'
}

group 'org.example'
version '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-data-rest'
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'

    runtimeOnly 'com.h2database:h2:'
    annotationProcessor("org.projectlombok:lombok")
    compileOnly("org.projectlombok:lombok")
}


test {
    useJUnitPlatform()
}
```



### depedencies 추가하는 방법
- 구글에 maven spring boot 검색 -> 글쓴이는 Gradle로 프로젝트 생성함


### 3. 패키지랑 클래스 생성
![image](https://user-images.githubusercontent.com/82345970/187358416-db314363-d3b1-4329-b747-65ecb44b25b7.png)


## 1. 구현하기
### 1-1 model 패키지 생성

![image](https://user-images.githubusercontent.com/82345970/187362793-cab49ea3-bb30-4fe7-856b-2328eba34d64.png)

## 2. repository 패키지 구현
- repository는 흔히 persistence Layer(영속성 계층 -> DB와 연결하는 부분) 데이터베이스와 데이터를 주고 받기 위한 인터페이스를 정의한 부분
- 실제 데이터를 저장하고 있는 클래스가 아니라, 데이터를 주고받는 방식인 인터페이스이다 -> repository 

![image](https://user-images.githubusercontent.com/82345970/187365109-e8d252d8-1157-4fdf-a6b3-8a9f006bdad2.png)

## 3.서비스구현
![image](https://user-images.githubusercontent.com/82345970/187365202-22147d66-c8ad-49f9-9a8f-7e7e408ce57a.png)

## 4. 컨트롤러 구현
### 서버의 들어온 요청을 받는 부분 
### API 설계문서 참고해서 코드작성 해야 함


