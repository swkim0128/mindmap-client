FROM java:8

WORKDIR /tmp

RUN mkdir -p /app/

COPY mindmap-beta-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
