FROM openjdk:11
ADD target/demo-application-0.0.1-SNAPSHOT.jar demo-application.jar
ENTRYPOINT ["java","-jar","demo-application.jar","--server.port=${PORT}"]
