package com.example.microservice.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.model.UserInfo;
import com.example.microservice.service.ProjectService;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired 
    private ProjectService projectService;

    @GetMapping("/")
    public List<Map<String,Object>> testApi() {
        return projectService.getAllMembersOfProject("2");
    }
}
