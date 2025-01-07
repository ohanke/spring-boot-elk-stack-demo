package com.oscarhanke.demo.controller;

import com.oscarhanke.demo.model.DemoRequest;
import com.oscarhanke.demo.service.DemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/demo")
@RequiredArgsConstructor
public class DemoController {

    private final DemoService service;

    @PostMapping
    public ResponseEntity<String> create(@RequestBody DemoRequest request) {
        log.info("Received /POST request with body: {}", request);

        String result = service.create(request);
        log.info("Entry created successfully, request ID: {}", result);

        return ResponseEntity.ok(result);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody DemoRequest request) {
        log.info("Received /PUT request with body: {}", request);

        String result = service.update(request);
        log.info("Entry updated successfully, request ID: {}", result);

        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
        log.info("Received /DELETE request with ID: {}", id);

        String result = service.delete(id);
        log.info("Entry deleted successfully, request ID: {}", result);

        return ResponseEntity.ok(result);
    }

}
