FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/PruebaTecSupermercado-1.0.0.jar
COPY ${JAR_FILE} app_pruebatecsuper.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_pruebatecsuper.jar"]