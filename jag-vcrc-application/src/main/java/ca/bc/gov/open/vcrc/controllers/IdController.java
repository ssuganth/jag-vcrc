package ca.bc.gov.open.vcrc.controllers;

import ca.bc.gov.open.vcrc.models.requests.GetNextInvoiceIdRequest;
import ca.bc.gov.open.vcrc.models.responses.GetNextInvoiceIdResponse;
import ca.bc.gov.open.vcrc.models.responses.LogEivFailureResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("VCRC/Source")
public class IdController {
    private final RestTemplate restTemplate;

    public IdController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "GetNextSessionId/Services", produces = MediaType.APPLICATION_XML_VALUE)
    public LogEivFailureResponse getNextSessionId(GetNextInvoiceIdRequest getNextInvoiceIdRequest) {
        return null;
    }

    @GetMapping(value = "GetNextInvoiceId/Services", produces = MediaType.APPLICATION_XML_VALUE)
    public GetNextInvoiceIdResponse getNextInvoiceId(GetNextInvoiceIdRequest logEivFailureRequest) {
        return null;
    }
}
