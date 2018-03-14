FROM maven:3.5.3
ADD pom.xml /tmp/build/
RUN cd /tmp/build && mvn install

ADD src /tmp/build/src
RUN cd /tmp/build && mvn package \
        && mv target/*.jar /app.jar \
        && cd / && rm -rf /tmp/build
VOLUME /tmp
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]