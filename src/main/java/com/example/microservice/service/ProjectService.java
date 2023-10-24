package com.example.microservice.service;

import java.util.List;

import com.example.microservice.model.ProjectList;

//implemented by ProjectServiceImpl from service/serviceimpl/ProjectServiceImpl.java
public interface ProjectService {
    // public ResponseEntity<Response> projectList();
    public List<ProjectList> projectList();
}
