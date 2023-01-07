FROM adoptopenjdk/openjdk11:jdk-11.0.17
WORKDIR /opt
ENV PORT 8080
EXPOSE 8080
COPY target/*.jar /opt/app.jar
ENTRYPOINT exec java $Java_OPTS -jar app.jar