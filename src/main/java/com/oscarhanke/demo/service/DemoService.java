package com.oscarhanke.demo.service;

import com.oscarhanke.demo.model.DemoRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DemoService {

    public String create(DemoRequest request) {
        log.info("Creating new record based on request: {}", request);

        return request.getId();
    }

    public String update(DemoRequest request) {
        log.info("Updating record based on request: {}", request);

        return request.getId();
    }

    public String delete(String id) {
        log.info("Deleting record with ID: {}", id);

        return id;
    }
}
