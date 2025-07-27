package com.example.grpcdemo.client;

import com.example.grpcdemo.proto.GreeterGrpc;
import com.example.grpcdemo.proto.HelloReply;
import com.example.grpcdemo.proto.HelloRequest;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GrpcClientRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(GrpcClientRunner.class);

    @GrpcClient("local-grpc-server")
    private GreeterGrpc.GreeterBlockingStub greeterStub;

    @Override
    public void run(String... args) {
        HelloRequest request = HelloRequest.newBuilder().setName("CurSor User").build();
        HelloReply reply = greeterStub.sayHello(request);
        logger.info("gRPC Response: {}", reply.getMessage());
    }
} 