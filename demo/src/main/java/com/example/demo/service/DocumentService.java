package com.example.demo.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.demo.contract.DocumentDto;
import com.example.demo.model.Document;
import com.example.demo.repository.DocumentRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class DocumentService {

      private final DocumentRepository documentRepository;
    private final ModelMapper modelMapper;

    public String saveData(DocumentDto documentDto) {
        Document documentEntity= modelMapper.map(documentDto,Document.class);
        documentRepository.save(documentEntity);
      return "Successfully saved";

    }

   


}
