package org.online.store.gateway.client;

import org.online.store.gateway.web.rest.model.SimpleResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

@FeignClient(name = "userService", url = "${reactive.feign.client.config.userService.url}")
public interface UserServiceClient {
    @GetMapping("/api/user")
    SimpleResponse getUser();
}
