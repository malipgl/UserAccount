FROM openjdk:8
COPY ./build/libs/* ./Task-0.0.2-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar","Task-0.0.2-SNAPSHOT.jar"]