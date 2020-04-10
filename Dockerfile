FROM openjdk:8
COPY ./target/spring_web_jpa_mysql-0.0.1-SNAPSHOT.jar spring_web_jpa_mysql-0.0.1-SNAPSHOT.jar
CMD ["JAVA", "-jar","spring_web_jpa_mysql-0.0.1-SNAPSHOT.jar"]