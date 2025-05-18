package org.online.store.gateway.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.online.store.common.dto.UserResponse;
import org.online.store.gateway.service.UserGrpcClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/gateway")
@RequiredArgsConstructor
public class GatewayController {

    private final UserGrpcClientService userService;

    @GetMapping("/user/{id}")
    public ResponseEntity<UserResponse> getUser(@PathVariable String id) {
        log.info("called getUser with id={}", id);
        var userDto = userService.getHello();
        return ResponseEntity.ok(new UserResponse(
                userDto.getId(),
                userDto.getUsername()

        ));
    }

}
