package org.online.store.gateway.client;
import org.online.store.common.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user-service",  url = "http://localhost:8081")
public interface UserClient {

    @GetMapping("/user/hello")
    UserDto helloFromUser();

}
