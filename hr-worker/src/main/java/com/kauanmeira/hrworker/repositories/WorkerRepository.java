package com.kauanmeira.hrworker.repositories;

import com.kauanmeira.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long > {

}
