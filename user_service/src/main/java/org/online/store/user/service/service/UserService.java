package org.online.store.user.service.service;

import lombok.RequiredArgsConstructor;
import org.online.store.common.dto.UserDto;
import org.online.store.grpc.Empty;
import org.online.store.grpc.UserServiceGrpc;
import org.springframework.stereotype.Service;

public interface UserService {

    UserDto getHello();

    @Service
    @RequiredArgsConstructor
    class Base implements UserService{
        private final UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub;

        public UserDto getHello() {
            var grpcUser = userServiceBlockingStub.getHello(Empty.newBuilder().build());

            return UserDto.builder()
                    .id(grpcUser.getId())
                    .fullName(grpcUser.getUsername())
                    .build();
        }
    }

}
