FROM openjdk:21-jdk-slim
WORKDIR /app
VOLUME /tmp
EXPOSE 8080
COPY target/testDeploySpringReact-0.0.1.jar /app/testDeploySpringReact-0.0.1.jar
ENTRYPOINT ["java","-jar","/testDeploySpringReact-0.0.1.jar"]