FROM openjdk:21
COPY ./target/schoolapp.jar schoolapp.jar
CMD ["java","-jar","schoolapp.jar"]