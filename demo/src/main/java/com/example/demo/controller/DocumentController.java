package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.contract.DocumentDto;
import com.example.demo.service.DocumentService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor

@RequestMapping("documentDetails")
public class DocumentController {
   
   
    private final DocumentService documentService;//service method
    @PostMapping("/documentDetails")
    public String  save(@RequestBody DocumentDto documentDto) {
            
        return documentService.saveData(documentDto);
}
}
