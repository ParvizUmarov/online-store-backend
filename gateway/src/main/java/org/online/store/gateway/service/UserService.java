package org.online.store.gateway.service;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.online.store.common.dto.UserDto;
import org.online.store.gateway.client.UserClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

public interface UserService {

    UserDto helloToUser();

    @Service
    @RequiredArgsConstructor
    class Base implements UserService {

        private final UserClient userClient;

        @Override
        public UserDto helloToUser() {
            return userClient.helloFromUser();
        }
    }

}
