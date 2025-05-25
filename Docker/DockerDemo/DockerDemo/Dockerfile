
FROM openjdk:21-jdk

WORKDIR /app

COPY target/DockerDemo-0.0.1-SNAPSHOT.jar my-app.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "my-app.jar"]
