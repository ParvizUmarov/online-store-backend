package org.online.store.gateway.service;

import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.online.store.grpc.Empty;
import org.online.store.grpc.UserDto;
import org.online.store.grpc.UserServiceGrpc;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserGrpcClientService {

    private final UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub;

    public UserDto getHello() {
        return userServiceBlockingStub.getHello(Empty.newBuilder().build());
    }
}