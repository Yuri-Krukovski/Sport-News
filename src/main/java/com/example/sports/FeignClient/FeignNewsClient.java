package com.example.sports.FeignClient;

import com.example.sports.config.URL;
import com.example.sports.domain.model.NewListInformation;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "FeignNewsClient", url = URL.XML_NEWS_RESOURCE)
public interface FeignNewsClient {

    @GetMapping
    @Headers("Content-Type: application/xml")
    NewListInformation getNews();
}
