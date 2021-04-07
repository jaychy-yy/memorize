# Memorize
## 개발자용 영어 단어 암기장
![memorize_logo](https://user-images.githubusercontent.com/48639421/113700612-042a0400-9712-11eb-8b77-a3990a286e05.png)  
영어 단어를 공부하려고 하는데 세상엔 영어 단어가 너무 많다...  
하지만 개발하는데 사용하는 영어 단어는 한정적이므로  
많이 사용되는 개발용 영어를 암기하는 것이 효율적일 것 같아, 만든 프로그램!!  

## Flow
- Jsoup 라이브러리를 이용하여 Spring Boot Docs를 크롤링하여 가장 많이 나온 영어 단어를 분석  
  (https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle)
- Kakao Translation API를 이용하여 영어 단어를 번역
- Kotlin Exposed 프레임워크를 이용하여 [영어]-[한글]-[갯수] 조합으로 데이터베이스에 저장
- 이를 토대로 Spring Boot 서버를 구축해 개발자용 영어 단어 암기~~

## Reference
- Kotlin Exposed Framework [Github] 문서 (https://github.com/JetBrains/Exposed)
- Kotlin Exposed Framework [Baeldung on Kotlin] 문서 (https://www.baeldung.com/kotlin/exposed-persistence)
- Kakao Translation API 카카오 문서 (https://developers.kakao.com/docs/latest/ko/translate/dev-guide)

## Library & Framework
- Kotlin 1.4.21
- Gradle 6.7.1
- Jsoup 1.11.1
- Kotlin Exposed 0.5.0
- Kotlin Coroutine 1.4.2
- Retrofit 2.9.0
- Spring Boot 2.4.1
- Spring Data JPA
- 자세한 사항은 build.gradle.kts에서 참고해주세요.

## Database
- MySQL 8.x.x

## APIs
[GitBook] https://app.gitbook.com/@jinjin0816/s/springbootdocscrawler

## Review
[Velog] https://velog.io/@dhwlddjgmanf/프로젝트-후기-Memorize
