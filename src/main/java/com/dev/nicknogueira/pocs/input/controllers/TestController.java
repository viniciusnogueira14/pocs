package com.dev.nicknogueira.pocs.input.controllers;

import com.dev.nicknogueira.pocs.input.resources.TestResource;
import com.dev.nicknogueira.pocs.output.entities.TestEntity;
import com.dev.nicknogueira.pocs.output.service.TestService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    private TestService service;

    public TestController(TestService service) {
        this.service = service;
    }

    @GetMapping
    public Collection<TestEntity> getAll() {
        return this.service.findAll();
    }

    @PostMapping
    public TestEntity create(@RequestBody TestEntity entity) {
        return service.create(entity);
    }
}
