package com.dev.nicknogueira.pocs.output.repositories;

import com.dev.nicknogueira.pocs.output.entities.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Long> {

}
