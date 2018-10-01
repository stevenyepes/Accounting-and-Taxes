FROM openjdk:8-jdk-alpine
VOLUME /tmp
WORKDIR /data/app
ARG JAR_FILE=./build/libs/accounting-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} accounting.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar", "accounting.jar"]