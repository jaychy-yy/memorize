# Spring Boot Docs Crawler

## Flow
- Jsoup 라이브러리를 이용하여 Spring Boot Docs (https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle)를 크롤링하여 가장 많이 나온 영어 단어를 분석
- Kakao Translation API를 이용하여 영어 단어를 번역
- Kotlin Exposed 프레임워크를 이용하여 [영어]-[한글]-[갯수] 조합으로 데이터베이스에 저장
- 이를 토대로 Spring Boot 서버를 구축해 개발자용 영어 단어 암기~~

