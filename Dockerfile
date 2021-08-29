FROM openjdk:11

EXPOSE 8081

ADD target/sb-dockerized-family.jar .

ENTRYPOINT ["java","-jar","sb-dockerized-family.jar"]

