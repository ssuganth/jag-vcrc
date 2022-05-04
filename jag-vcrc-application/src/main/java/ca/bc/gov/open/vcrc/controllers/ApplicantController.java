package ca.bc.gov.open.vcrc.controllers;

import ca.bc.gov.open.vcrc.models.requests.CheckApplicantForPrevCRCRequest;
import ca.bc.gov.open.vcrc.models.requests.CreateApplicantRequest;
import ca.bc.gov.open.vcrc.models.responses.CheckApplicantForPrevCRCExResponse;
import ca.bc.gov.open.vcrc.models.responses.CheckApplicantForPrevCRCResponse;
import ca.bc.gov.open.vcrc.models.responses.CreateApplicantResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("VCRC/Source")
public class ApplicantController {

    private final RestTemplate restTemplate;

    @Autowired
    public ApplicantController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(
            value = "CheckApplicantForPrevCRC/Services",
            produces = MediaType.APPLICATION_XML_VALUE)
    public CheckApplicantForPrevCRCResponse checkApplicantForPrevCRC(
            CheckApplicantForPrevCRCRequest checkApplicantForPrevCRCRequest) {

        return null;
    }

    @GetMapping(
            value = "CheckApplicantForPrevCRCEx/Services",
            produces = MediaType.APPLICATION_XML_VALUE)
    public CheckApplicantForPrevCRCExResponse checkApplicantForPrevCRCEx(
            CheckApplicantForPrevCRCRequest checkApplicantForPrevCRCRequest) {
        return null;
    }

    @GetMapping(value = "CreateApplicant/Services", produces = MediaType.APPLICATION_XML_VALUE)
    public CreateApplicantResponse createApplicant(CreateApplicantRequest createApplicant) {
        return null;
    }

    @GetMapping(value = "CreateApplicantEx/Services", produces = MediaType.APPLICATION_XML_VALUE)
    public CreateApplicantResponse createApplicantEx(CreateApplicantRequest createApplicant) {
        return null;
    }
}
