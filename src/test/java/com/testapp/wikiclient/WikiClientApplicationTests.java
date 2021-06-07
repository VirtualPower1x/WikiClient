package com.testapp.wikiclient;

import com.testapp.wikiclient.dto.AddPageRequestDto;
import com.testapp.wikiclient.feign.WikiClient;
import com.testapp.wikiclient.model.PageObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.Map;
import java.util.Objects;

@SpringBootTest
class WikiClientApplicationTests {

    @Autowired
    private WikiClient wikiClient;

    @Value("${wiki.oauth2-access-token}")
    private String token;

    @Test
    public void contextLoads() {

    }

    @Test
    public void wikiClientGetPageText() {
        ResponseEntity<PageObject> response = wikiClient.getPage("Jupiter");
        Assertions.assertEquals(38930, Objects.requireNonNull(response.getBody()).getId());
    }

    @Test
    public void wikiClientAddPageText() {
        AddPageRequestDto dto = new AddPageRequestDto(
                "Hello, world!",
                "User:RestfulDeveloper/Sandbox",
                "Creating a test page with the REST API");
        Map<String, String> headers = Map.of(
                "Content-Type", "application/json",
                "Authorization", "Bearer " + token);
        ResponseEntity<PageObject> response = wikiClient.addPage(dto, headers);
        Assertions.assertEquals("User:RestfulDeveloper/Sandbox",
                Objects.requireNonNull(response.getBody()).getTitle());
    }
}
