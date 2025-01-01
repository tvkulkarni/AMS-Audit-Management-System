FROM openjdk:8
EXPOSE 9092
ADD target/ams-audit-severity.jar ams-audit-severity.jar
ENTRYPOINT ["java","-jar","/ams-audit-severity.jar"]