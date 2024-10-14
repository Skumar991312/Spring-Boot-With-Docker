FROM openjdk:1.8
EXPOSE 8080
ADD target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT [ "jar","-jar","spring-boot-docker.jar" ]
