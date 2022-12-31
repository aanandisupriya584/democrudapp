FROM jdk:11
EXPOSE 8080
add target/democrud.jar democrud.jar
ENTRYPOINT ["java","-jar","democrud.jar"]