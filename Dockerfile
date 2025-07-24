# Use an official OpenJDK image
FROM eclipse-temurin:17-jdk

# Set working directory inside container
WORKDIR /app

# Copy all project files into the container
COPY . .

# Build the Spring Boot application
RUN ./mvnw clean package -DskipTests

# Run the generated JAR
CMD ["java", "-jar", "target/bhojan-0.0.1-SNAPSHOT.jar"]
