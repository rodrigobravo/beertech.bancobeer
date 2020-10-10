FROM maven:3.6.3-jdk-11-slim AS MAVEN_BUILD
MAINTAINER Grupo Colorado
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn package -DskipTests
FROM openjdk:11-jre
WORKDIR /app
COPY --from=MAVEN_BUILD /build/target/banco-beer-consumer-0.0.1-SNAPSHOT.jar /app/
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod" , "banco-beer-consumer-0.0.1-SNAPSHOT.jar"]