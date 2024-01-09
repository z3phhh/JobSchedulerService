package com.jobflowengine.handler.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.jobflowengine.handler.service.RestApiService;
import com.jobflowengine.handler.util.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/handler")
@AllArgsConstructor
public class ApiHandlerController {

    private RestApiService restApiService;

    @GetMapping("/vacancies")
    public JsonNode getVacancy() {
        ApiResponse response = restApiService.fetch("https://api.hh.ru", "/vacancies");
        return response.toJson();
    }
}
