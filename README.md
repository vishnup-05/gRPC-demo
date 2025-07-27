# Spring Boot gRPC Demo

This project demonstrates a simple gRPC server and client using Java, Spring Boot, and Protocol Buffers.

## Features
- **Spring Boot** application structure
- **gRPC server** with a sample `Greeter` service
- **gRPC client** that calls the server on startup
- **Protocol Buffers** for service and message definitions
- Maven build with protobuf and gRPC plugins

## Project Structure
```
├── src/main/java/com/example/grpcdemo/
│   ├── GrpcDemoApplication.java         # Spring Boot entry point
│   ├── service/GreeterService.java      # gRPC service implementation
│   └── client/GrpcClientRunner.java     # gRPC client runner
├── src/main/proto/greeter.proto         # gRPC service and messages definition
├── pom.xml                              # Maven build file
```

## gRPC Service Definition
The `greeter.proto` file defines a simple service:
```proto
service Greeter {
  rpc SayHello (HelloRequest) returns (HelloReply);
}

message HelloRequest {
  string name = 1;
}

message HelloReply {
  string message = 1;
}
```

## How It Works
- The **server** implements the `Greeter` service, responding to `SayHello` requests with a personalized greeting.
- The **client** sends a `SayHello` request to the server on application startup and logs the response.

## Getting Started

### Prerequisites
- Java 17+
- Maven 3.6+

### Build and Run
1. **Clone the repository:**
   ```sh
   git clone <repo-url>
   cd gRPC_Demo
   ```
2. **Build the project:**
   ```sh
   mvn clean install
   ```
3. **Run the application:**
   ```sh
   mvn spring-boot:run
   ```
   The client will automatically send a gRPC request to the server and log the response.

## Dependencies
- Spring Boot 3.2.6
- grpc-spring-boot-starter 2.15.0.RELEASE
- Protobuf 3.25.3
- gRPC Java 1.62.2

## Customization
- Edit `src/main/proto/greeter.proto` to change the service or messages.
- Implement additional gRPC services in the `service/` package.

## References
- [Spring Boot](https://spring.io/projects/spring-boot)
- [gRPC Java](https://grpc.io/docs/languages/java/)
- [grpc-spring-boot-starter](https://yidongnan.github.io/grpc-spring-boot-starter/en/)
- [Protocol Buffers](https://developers.google.com/protocol-buffers)

---
Feel free to contribute or open issues for improvements! 
