FROM openjdk:latest

ARG JAR_FILENAME
ADD $JAR_FILENAME app.jar
ARG PORT_NBR
EXPOSE $PORT_NBR
ENTRYPOINT ["java","-jar","app.jar"]
