FROM eclipse-temurin:21-jdk-jammy AS builder
WORKDIR /app
COPY . .
CMD ["java","src/main/java/com/Learning/practiceJava/streams/Tests/reverseTest.java"]