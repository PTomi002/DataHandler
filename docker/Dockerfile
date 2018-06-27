FROM openjdk:8

WORKDIR /resources

ADD . /resources

EXPOSE 8081

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","DataHandler.jar"]