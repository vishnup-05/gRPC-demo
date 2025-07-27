package com.example.grpcdemo.service;

import com.example.grpcdemo.proto.GreeterGrpc;
import com.example.grpcdemo.proto.HelloReply;
import com.example.grpcdemo.proto.HelloRequest;
import net.devh.boot.grpc.server.service.GrpcService;
import io.grpc.stub.StreamObserver;

@GrpcService
public class GreeterService extends GreeterGrpc.GreeterImplBase {
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        String message = "Hello, " + request.getName() + "!";
        HelloReply reply = HelloReply.newBuilder().setMessage(message).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
} 