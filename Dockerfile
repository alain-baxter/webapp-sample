FROM docker.io/library/openjdk:8-jdk-alpine

COPY target/webapp-sample-*.jar webapp-sample.jar

ENTRYPOINT ["java","-jar","/webapp-sample.jar"]