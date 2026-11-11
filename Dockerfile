
# Stage 1: Use Java 17 runtime
FROM eclipse-temurin:17-jre

# Create application directory
WORKDIR /app

# Copy the Maven-generated JAR file
COPY target/maven-github-demo-1.0-SNAPSHOT.jar app.jar

# Execute the Equilateral Triangle application
ENTRYPOINT ["java", "-cp", "app.jar", "com.example.EquilateralTriangle"]
