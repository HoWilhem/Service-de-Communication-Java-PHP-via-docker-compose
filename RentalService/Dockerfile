FROM gradle:8.5-jdk21 AS builder
WORKDIR /home/gradle/project
COPY --chown=gradle:gradle . /home/gradle/project
RUN chmod +x ./gradlew && ./gradlew bootJar -x test

FROM eclipse-temurin:21-jre-jammy
VOLUME /tmp
EXPOSE 8080
COPY --from=builder /home/gradle/project/build/libs/*.jar /app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]