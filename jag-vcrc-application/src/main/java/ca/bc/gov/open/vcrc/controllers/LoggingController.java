package ca.bc.gov.open.vcrc.controllers;

import ca.bc.gov.open.vcrc.models.requests.LogEivFailureRequest;
import ca.bc.gov.open.vcrc.models.responses.LogEivFailureResponse;
import ca.bc.gov.open.vcrc.models.responses.LogPaymentFailureResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("VCRC/Source")
public class LoggingController {
    private final RestTemplate restTemplate;

    public LoggingController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "LogEivFailure/Services", produces = MediaType.TEXT_XML_VALUE)
    public LogEivFailureResponse logEivFailure(LogEivFailureRequest logEivFailureRequest) {
        return null;
    }

    @GetMapping(value = "LogPaymentFailure/Services", produces = MediaType.TEXT_XML_VALUE)
    public LogPaymentFailureResponse logPaymentFailure(LogEivFailureRequest logEivFailureRequest) {
        return null;
    }
}
