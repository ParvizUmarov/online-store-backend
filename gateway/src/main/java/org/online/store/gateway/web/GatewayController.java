package org.online.store.gateway.web;

import lombok.RequiredArgsConstructor;
import org.online.store.common.dto.UserDto;
import org.online.store.gateway.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/gateway")
@RequiredArgsConstructor
public class GatewayController {

    private final UserService userService;

    @GetMapping("/user/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable String id) {
        return ResponseEntity.ok(userService.helloToUser());
    }

}
