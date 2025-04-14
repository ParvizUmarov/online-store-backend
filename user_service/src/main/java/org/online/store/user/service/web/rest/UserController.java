package org.online.store.user.service.web.rest;

import org.online.store.user.service.web.rest.model.SimpleResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping
    public ResponseEntity<SimpleResponse> getUserInfo() {
        return ResponseEntity.ok(new SimpleResponse("Hello from user service"));
    }
}
