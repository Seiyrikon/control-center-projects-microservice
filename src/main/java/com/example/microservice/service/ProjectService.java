package com.example.microservice.service;

import org.springframework.http.ResponseEntity;

import com.example.microservice.shared.Response;

//implemented by ProjectServiceImpl from service/serviceimpl/ProjectServiceImpl.java
public interface ProjectService {
    public ResponseEntity<Response> projectList();
}
