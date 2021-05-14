21.05.08 세미나 과제
=====

# 1. Spring 컨테이너
--------

## 1.1. OrderApp

### 1.1.1. 코드

``` java 
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
```
### 1.1.2. output

<img src="01.png">


## 1.2. MemeberApp
> 추가로 MemberApp 또한 스프링 컨테이너/빈을 사용한 구조로 변경

### 1.2.1. 코드

``` java
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
```

### 1.2.2. output

<img src="02.png">






