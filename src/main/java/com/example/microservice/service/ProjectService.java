package com.example.microservice.service;

import java.util.List;
import java.util.Map;

import com.example.microservice.model.Project;
import com.example.microservice.model.ProjectList;

//implemented by ProjectServiceImpl from service/serviceimpl/ProjectServiceImpl.java
public interface ProjectService {
    public List<ProjectList> projectList();

    public List<Map<String, Object>> getAllMembersOfProject(String proj_id);

    public Project getProjectById(String proj_id);
}
