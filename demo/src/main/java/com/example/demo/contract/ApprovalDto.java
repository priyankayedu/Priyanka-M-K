package com.example.demo.contract;

import java.time.LocalDateTime;
import java.util.UUID;

import com.example.demo.model.ApprovalStatus;
import com.example.demo.model.Department;
import com.example.demo.model.DocumentWorkflow;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ApprovalDto {
    private DocumentWorkflow documentWorkflow;
    private Department approverDepartment;
    private ApprovalStatus approvalStatus;
    private LocalDateTime approvalDate;
    private UUID approverId;
    private String comments;

}
