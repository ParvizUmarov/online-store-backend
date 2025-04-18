package org.online.store.user.service.service;

import org.online.store.common.dto.UserDto;
import org.springframework.stereotype.Service;

public interface UserService {

    UserDto getHello();

    @Service
    class Base implements UserService{

        @Override
        public UserDto getHello() {
            return  UserDto.builder()
                    .id(12L)
                    .fullName("Parviz Umarov")
                    .build();
        }
    }

}
