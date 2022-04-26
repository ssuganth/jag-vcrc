package ca.bc.gov.open.vcrc.controllers;

import ca.bc.gov.open.vcrc.models.requests.CreateNewCRCServiceRequest;
import ca.bc.gov.open.vcrc.models.requests.CreateSharingServiceRequest;
import ca.bc.gov.open.vcrc.models.requests.GetServiceFeeAmountRequest;
import ca.bc.gov.open.vcrc.models.responses.CreateNewCRCServiceResponse;
import ca.bc.gov.open.vcrc.models.responses.CreateSharingServiceResponse;
import ca.bc.gov.open.vcrc.models.responses.GetServiceFeeAmountResponse;
import ca.bc.gov.open.vcrc.models.responses.UpdateServiceFinancialTxnResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("VCRC/Source")
public class ServiceController {
    private final RestTemplate restTemplate;

    public ServiceController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "CreateNewCRCService/Services", produces = MediaType.APPLICATION_XML_VALUE)
    public CreateNewCRCServiceResponse createNewCrcService(
            CreateNewCRCServiceRequest createNewCRCServiceRequest) {
        return null;
    }

    @GetMapping(value = "CreateSharingService/Services", produces = MediaType.APPLICATION_XML_VALUE)
    public CreateSharingServiceResponse createSharingService(
            CreateSharingServiceRequest createSharingServiceRequest) {
        return null;
    }

    @GetMapping(value = "GetServiceFeeAmount/Services", produces = MediaType.APPLICATION_XML_VALUE)
    public GetServiceFeeAmountResponse getServiceFeeAmount(
            GetServiceFeeAmountRequest getServiceFeeAmountRequest) {
        return null;
    }

    @GetMapping(
            value = "UpdateServiceFinancialTxn/Services",
            produces = MediaType.APPLICATION_XML_VALUE)
    public UpdateServiceFinancialTxnResponse updateServiceFinancialTxn(
            CreateSharingServiceRequest createSharingServiceRequest) {
        return null;
    }
}
