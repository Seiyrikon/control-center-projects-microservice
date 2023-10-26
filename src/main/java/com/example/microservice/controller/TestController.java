package com.example.microservice.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.model.ProjectList;
import com.example.microservice.model.UserInfo;
import com.example.microservice.service.ProjectService;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired 
    private ProjectService projectService;

    @GetMapping("/all-project")
    public List<ProjectList> projectList() {
        return projectService.projectList();
    }

    @GetMapping("/project-members")
    public List<Map<String,Object>> testApi() {
        return projectService.getAllMembersOfProject("2");
    }
}
