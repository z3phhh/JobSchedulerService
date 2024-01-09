package com.jobflowengine.handler.util;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.reactive.function.client.WebClient;

public class ApiResponse {
    private final WebClient.RequestHeadersSpec<?> headersSpec;

    public ApiResponse(WebClient.RequestHeadersSpec<?> headersSpec) {
        this.headersSpec = headersSpec;
    }

    public JsonNode toJson() {
        return headersSpec.retrieve()
                .bodyToMono(JsonNode.class)
                .block();
    }
}
