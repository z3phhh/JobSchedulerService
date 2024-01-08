package com.jobflowengine.analytics.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AnalyticsServiceController.class)
public class AnalyticsServiceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getHelloWorld() throws Exception {
        mockMvc.perform(get("/api/hello-worl"))
                .andExpect(status().isOk())
                .andDo(print());
    }
}
