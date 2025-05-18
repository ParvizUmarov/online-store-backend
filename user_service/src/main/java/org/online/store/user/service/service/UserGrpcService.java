package org.online.store.user.service.service;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.online.store.grpc.Empty;
import org.online.store.grpc.UserDto;
import org.online.store.grpc.UserServiceGrpc;

@Slf4j
@GrpcService
public class UserGrpcService extends UserServiceGrpc.UserServiceImplBase {

    @Override
    public void getHello(Empty request, StreamObserver<UserDto> responseObserver) {
        log.info("UserGrpcService called getHello");
        responseObserver.onNext(UserDto.newBuilder().setUsername("Hi!").build());
        responseObserver.onCompleted();
    }
}
