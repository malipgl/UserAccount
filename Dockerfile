FROM openjdk:8
EXPOSE 8081
ADD build/libs/Task-0.0.2-SNAPSHOT.jar Task-0.0.2-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Task-0.0.2-SNAPSHOT.jar"]