FROM eclipse-temurin:17
COPY build/libs/DevOps-ExaminationProject-0.0.1-SNAPSHOT.jar /app/app.jar
WORKDIR /app
CMD ["java", "-jar", "app.jar"]