package com.example.microservice.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.microservice.model.ProjectList;
import com.example.microservice.shared.Response;

//implemented by ProjectServiceImpl from service/serviceimpl/ProjectServiceImpl.java
public interface ProjectService {
    // public ResponseEntity<Response> projectList();
    public List<ProjectList> projectList();
}
