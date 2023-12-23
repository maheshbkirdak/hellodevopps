FROM openjdk:17
EXPOSE 8080
ADD target/hellodevopps.jar hellodevopps.jar
ENTRYPOINT [ "java","-jar","/hellodevopps.jar" ]