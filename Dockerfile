FROM openjdk:17-alpine

COPY ./target/dockerdemo2-0.0.1-SNAPSHOT.jar dockerdemo2.jar
ENTRYPOINT ["java","-jar","dockerdemo2.jar"]
