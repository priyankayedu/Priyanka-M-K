package com.example.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Approval;

@Repository

public interface ApprovalRepository extends JpaRepository<Approval,UUID>{

}
