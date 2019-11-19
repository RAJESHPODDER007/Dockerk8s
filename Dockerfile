FROM openjdk:8-jdk-alpine
WORKDIR '/usr/app/'
COPY target/*.jar ./
CMD ["java","-jar","/usr/app/application-1.0.jar"]