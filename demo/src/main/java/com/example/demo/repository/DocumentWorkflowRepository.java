package com.example.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.DocumentWorkflow;

@Repository
public interface DocumentWorkflowRepository extends JpaRepository<DocumentWorkflow,UUID> {

}
