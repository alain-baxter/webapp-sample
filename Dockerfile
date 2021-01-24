FROM docker.io/library/openjdk:8-jdk-alpine

COPY target/webapp-sample-*.jar webapp-sample.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","/webapp-sample.jar"]