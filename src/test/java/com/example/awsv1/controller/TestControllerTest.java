package com.example.awsv1.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TestControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void helloTest(){
        ResponseEntity<String> response = restTemplate.getForEntity("/aws/v1", String.class);
        assertEquals("<H1>aws v1</H1>", response.getBody());
    }
}