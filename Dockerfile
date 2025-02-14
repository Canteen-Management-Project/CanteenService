FROM openjdk:17-jdk-slim
#WORKDIR /app
COPY target/canteen-service-0.0.1-SNAPSHOT.jar canteen-service.jar
EXPOSE 9093
ENTRYPOINT [ "java","-jar","canteen-service.jar" ] 