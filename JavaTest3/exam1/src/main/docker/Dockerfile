FROM openjdk:8-jdk-alpine
ENV MYSQL_ROOT_NAME root
ENV MYSQL_ROOT_PASSWORD root
ENV ip localhost
ENV port: 8080
ENV title "this is java test three"
ENV  film_id 2000

VOLUME /tmp
ADD java-test-3-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]