FROM openjdk:latest
CMD echo "hello from Dockerfile"
RUN mkdir -p /appl
EXPOSE 6969
# RUN pwd
COPY target/tilldb-0.0.1-SNAPSHOT.jar /appl/tilldb.jar
WORKDIR /appl/
CMD ["/usr/bin/java", "-jar", "/appl/tilldb.jar"]