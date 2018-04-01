#FROM maven:3.5.3
#ADD pom.xml /tmp/build/
#RUN cd /tmp/build && mvn dependency:resolve
#
#ADD src /tmp/build/src
#RUN cd /tmp/build && mvn package \
#        && mv target/*.jar /app.jar \
#        && cd / && rm -rf /tmp/build
#VOLUME /tmp
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]