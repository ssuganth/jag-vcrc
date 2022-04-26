package ca.bc.gov.open.vcrc.controllers;

import ca.bc.gov.open.vcrc.models.responses.GetCountriesListResponse;
import ca.bc.gov.open.vcrc.models.responses.GetProvinceListResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("VCRC/Source")
public class LocationController {

    private final RestTemplate restTemplate;

    public LocationController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "GetCountryList/Services", produces = MediaType.APPLICATION_XML_VALUE)
    public GetCountriesListResponse getCountriesList() {
        return null;
    }

    @GetMapping(value = "GetProvinceList/Services", produces = MediaType.APPLICATION_XML_VALUE)
    public GetProvinceListResponse getProvinceList() {
        return null;
    }
}
