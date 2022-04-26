package ca.bc.gov.open.vcrc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        //        restTemplate.getMessageConverters().add(0,
        // createMappingJacksonHttpMessageConverter());
        return restTemplate;
    }
}
