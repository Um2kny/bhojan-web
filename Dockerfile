# 1. Use official Maven image to build the project
FROM maven:3.9.6-eclipse-temurin-17 AS build

# Set working directory
WORKDIR /app

# Copy all files
COPY . .

# Build the application without running tests
RUN mvn clean package -DskipTests

# 2. Use a lightweight OpenJDK image to run the app
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy the built JAR from the build image
COPY --from=build /app/target/bhojan-0.0.1-SNAPSHOT.jar app.jar

# Run the JAR
CMD ["java", "-jar", "app.jar"]
