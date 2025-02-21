FROM openjdk:17-jdk-slim

# workdir inside of the container

WORKDIR /app

# copy our project into the container

COPY target/*.jar app.jar

EXPOSE 8080

# the start of the Spring app

ENTRYPOINT ["java", "-jar", "app.jar"]