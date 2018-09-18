FROM openjdk:8-jdk-alpine
VOLUME /tmp
WORKDIR /data/app
RUN mkdir -p /opt
#install Gradle
RUN wget -q https://services.gradle.org/distributions/gradle-4.5.1-bin.zip \
    && unzip gradle-4.5.1-bin.zip -d /opt \
    && rm gradle-4.5.1-bin.zip

# Set Gradle in the environment variables
ENV GRADLE_HOME /opt/gradle-4.5.1
ENV PATH $PATH:/opt/gradle-4.5.1/bin
#ARG JAR_FILE=./build/libs/accounting-0.0.1-SNAPSHOT.jar
RUN gradle build
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/build/libs/accounting-0.0.1-SNAPSHOT.jar"]