FROM maven:3.8.6-openjdk-18

WORKDIR /app

COPY ./src src
COPY ./pom.xml pom.xml

CMD ["mvn", "spring-boot:run"]