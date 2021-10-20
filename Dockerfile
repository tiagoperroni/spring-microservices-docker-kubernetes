FROM openjdk:11

WORKDIR /app

COPY /target/kubernetes-0.0.1-SNAPSHOT.jar /app/kubernetes-0.0.1-SNAPSHOT.jar

ENTRYPOINT [ "java", "-jar", "/app/kubernetes-0.0.1-SNAPSHOT.jar" ]