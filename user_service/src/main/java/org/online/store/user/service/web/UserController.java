package org.online.store.user.service.web;

import lombok.RequiredArgsConstructor;
import org.online.store.common.dto.UserDto;
import org.online.store.user.service.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/hello")
    public ResponseEntity<UserDto> getUser() {
        return ResponseEntity.ok(userService.getHello());
    }
}
