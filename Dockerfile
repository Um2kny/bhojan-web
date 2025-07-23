# Use an official OpenJDK image
FROM eclipse-temurin:17-jdk

# Set working directory inside container
WORKDIR /app

# Copy Maven project files
COPY . .

# Build the application
RUN ./mvnw clean package -DskipTests

# Run the Spring Boot JAR
CMD ["java", "-jar", "target/bhojan-0.0.1-SNAPSHOT.jar"]
