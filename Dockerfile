FROM openjdk
WORKDIR ./devops
COPY ./target/devops-1.0-SNAPSHOT-jar-with-dependencies.jar ./devops
CMD ["java", "-jar", "devops-1.0-SNAPSHOT-jar-with-dependencies.jar"]