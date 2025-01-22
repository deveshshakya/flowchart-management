# **Flowchart Management System**

## **Requirements**

To run the project, ensure you have the following installed and configured on your machine:

1. **Java Development Kit (JDK) 21**
    - Download and install JDK 21 from the [official Oracle website](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html) or [OpenJDK](https://openjdk.org/).

2. **Gradle**
    - Ensure Gradle is installed on your system. You can verify by running:
      ```bash
      gradle --version
      ```
      If not installed, download it from the [official Gradle website](https://gradle.org/install/).

3. **Redis**
    - A running instance of Redis is required.
        - Install Redis using your package manager, e.g., `apt` for Ubuntu or `brew` for macOS.
        - Start Redis with the command:
          ```bash
          redis-server
          ```
    - Default Redis host and port are used (`localhost:6379`). Ensure these are accessible.

---

## **Steps to Run the Project**

1. **Clone the Repository**
    - Clone the project from the repository to your local machine:


2. **Build the Project**
    - Use Gradle to build the project:
      ```bash
      ./gradlew build
      ```

3. **Run the Application**
    - Use Gradle to run the application:
      ```bash
      ./gradlew bootRun
      ```

4. **Access the Application**
    - Once the application starts, it will be available at:
      ```
      http://localhost:8081
      ```

5. **Swagger Documentation**
    - API documentation can be accessed at:
      ```
      http://localhost:8081/swagger-ui.html
      ```

---
