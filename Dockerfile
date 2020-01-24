FROM openjdk:8
EXPOSE 8080
ADD target/mulib-1.0-SNAPSHOT.jar mulib-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/mulib-1.0-SNAPSHOT.jar"]