FROM openjdk:12-alpine

COPY justJar.jar /test.jar

CMD ["java", "-jar", "/test.jar"]

