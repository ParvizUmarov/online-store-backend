package org.online.store.gateway.web.rest;

import java.util.Collections;
import org.online.store.gateway.client.UserServiceClient;
import org.online.store.gateway.web.rest.model.SimpleResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/gateway")
public class GatewayController {

    private static final Logger LOG = LoggerFactory.getLogger(GatewayController.class);

    private final UserServiceClient userServiceClient;

    public GatewayController(UserServiceClient userServiceClient) {
        this.userServiceClient = userServiceClient;
    }

    @GetMapping("/user")
    public ResponseEntity<SimpleResponse> getUser() {
        LOG.debug("REST request to get user from UserService");

        var user = userServiceClient.getUser();
        LOG.debug("Response from get user: {}", user);

        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
