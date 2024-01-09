FROM openjdk:17
EXPOSE 8080
ADD target/hello-action.jar hello-action.jar
ENTRYPOINT ["java","-jar","/hello-action.jar"]
#docker run -p 8081:8081 bhupensin07/store-repo