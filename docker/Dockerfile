FROM openjdk:8

WORKDIR /resources

ADD . /resources

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","DataHandler.jar"]