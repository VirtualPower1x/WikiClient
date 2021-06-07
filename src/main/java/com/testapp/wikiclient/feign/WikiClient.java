package com.testapp.wikiclient.feign;

import com.testapp.wikiclient.dto.AddPageRequestDto;
import com.testapp.wikiclient.model.PageObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient(
        name = "wiki-service",
        url = "${wiki.api-base-url}"
)
public interface WikiClient {

    @GetMapping("/page/{title}/bare")
    ResponseEntity<PageObject> getPage(@PathVariable String title);

    @PostMapping("/page")
    ResponseEntity<PageObject> addPage(
            @RequestBody AddPageRequestDto requestDto,
            @RequestHeader Map<String, String> headers);
}
