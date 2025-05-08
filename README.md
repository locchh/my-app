# Spring Hello World Application

A simple Spring Framework application that demonstrates basic Spring context configuration and dependency injection using XML-based configuration.

## Project Structure

```
src/main/java/com/example/app/
├── App.java                 # Main application class
├── HelloWorld.java         # HelloWorld bean class
src/main/resources/
├── applicationContext.xml  # Spring XML configuration
```

## Prerequisites

- Java 21
- Maven 3.x

## Building the Application

To build the application, run:

```bash
mvn clean compile
```

## Running the Application

To run the application, use:

```bash
mvn exec:java -Dexec.mainClass="com.example.app.App"
```

## Application Overview

This application demonstrates:

1. XML-based Spring configuration using `applicationContext.xml`
2. Bean definition and property injection
3. Loading a Spring application context in a Java application
4. Retrieving beans from the Spring context

## Configuration Details

The Spring context is configured in `applicationContext.xml`, which defines a `HelloWorld` bean with a message property set to "Hello World!".

The `App` class loads this configuration and retrieves the `HelloWorld` bean from the context, then calls its `toString()` method to display the message.