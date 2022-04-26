FROM openjdk:11-jre-slim

COPY ./jag-vcrc-application/target/vcrc-application.jar vcrc-application.jar

ENTRYPOINT ["java","-jar","/vcrc-application.jar"]