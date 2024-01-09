package com.jobflowengine.handler.service;

import com.jobflowengine.handler.util.ApiResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class RestApiService {
    public ApiResponse fetch(String baseUrl, String uri) {
        WebClient client = webClientCfg(baseUrl);
        return new ApiResponse(client.get()
                .uri(uri));
    }

    private WebClient webClientCfg(String baseUrl) {
        return WebClient.builder()
                .baseUrl(baseUrl)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }
}
