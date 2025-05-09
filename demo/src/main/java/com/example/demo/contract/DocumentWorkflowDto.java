package com.example.demo.contract;

import java.time.LocalDateTime;
import java.util.UUID;

import com.example.demo.model.Document;
import com.example.demo.model.WorkflowState;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class DocumentWorkflowDto {
    private Document document;
    private WorkflowState currentState;
    private LocalDateTime lastModifiedDate;
    private UUID modifiedByUserId;
    private String comments;
    

}
