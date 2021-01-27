package com.example.sports.config;

import com.example.sports.FeignClient.FeignNewsClient;
import com.example.sports.domain.model.NewListInformation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@AllArgsConstructor
public class DataInitializer {

    private final FeignNewsClient newsClient;

    @PostConstruct
    public void dataInit(){

        NewListInformation news = newsClient.getNews();
        System.out.println(news);

    }




//    private final RestTemplate restTemplate;
//
//    public DataInitializer(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }
//
//
//    @PostConstruct
//    public void init() {
//        ResponseEntity<List<Cake>> responseEntity =
//                restTemplate.exchange(
//                        PATH,
//                        HttpMethod.GET,
//                        null,
//                        new ParameterizedTypeReference<>() {
//                        }
//                );
//        List<Cake> cakes;
//        if (!Objects.requireNonNull(responseEntity.getBody()).isEmpty()) {
//            cakes = responseEntity.getBody();
//            cakes.forEach(cakeRepository::save);
//        }
//    }
}
