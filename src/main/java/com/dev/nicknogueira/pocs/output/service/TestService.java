package com.dev.nicknogueira.pocs.output.service;

import com.dev.nicknogueira.pocs.input.resources.TestResource;
import com.dev.nicknogueira.pocs.output.entities.TestEntity;
import com.dev.nicknogueira.pocs.output.repositories.TestRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TestService {

    private TestRepository repository;

    public TestService(TestRepository repository) {
        this.repository = repository;
    }

    public Collection<TestEntity> findAll() {
        return repository.findAll();
    }

    public TestEntity create(TestEntity entity) {
        return repository.save(entity);
    }
}
