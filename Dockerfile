FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.war
COPY ${JAR_FILE} sample.war
ENTRYPOINT ["java", "-Dserver.port=8082", "-jar", "/sample.war"]

