package com.example.demo.contract;

import java.time.LocalDate;

import org.w3c.dom.DocumentType;

import com.example.demo.model.Department;
import com.example.demo.model.SecurityClassification;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocumentDto {
    private String documentNumber;
    private String title;
    private String description;
    private LocalDate createdDate;
    private Department department;
    private DocumentType documentType;
    private SecurityClassification securityClassification;
    private String fileLocation;
    private String version;


}
