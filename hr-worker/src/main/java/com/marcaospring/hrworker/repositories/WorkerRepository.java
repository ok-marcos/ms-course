package com.marcaospring.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcaospring.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
