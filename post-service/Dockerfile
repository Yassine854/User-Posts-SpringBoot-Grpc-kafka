FROM openjdk:19-jdk

WORKDIR /app

COPY ./target/post-service-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app.jar"]
