package ca.bc.gov.open.vcrc.controllers;

import ca.bc.gov.open.vcrc.models.requests.AuthenticateUserRequest;
import ca.bc.gov.open.vcrc.models.responses.AuthenticateUserResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("VCRC/Source")
public class AuthenticationController {
    private final RestTemplate restTemplate;

    public AuthenticationController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "DoAuthenticateUser/Services", produces = MediaType.APPLICATION_XML_VALUE)
    public AuthenticateUserResponse authenticateUser(
            AuthenticateUserRequest authenticateUserRequest) {
        return null;
    }
}
