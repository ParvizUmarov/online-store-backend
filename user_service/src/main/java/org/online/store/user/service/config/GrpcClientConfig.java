package org.online.store.user.service.config;

import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import org.online.store.grpc.UserServiceGrpc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcClientConfig {

    @Bean
    public UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub(Channel grpcChannel) {
        return UserServiceGrpc.newBlockingStub(grpcChannel);
    }

    @Bean
    public Channel grpcChannel() {
        return ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();
    }
}