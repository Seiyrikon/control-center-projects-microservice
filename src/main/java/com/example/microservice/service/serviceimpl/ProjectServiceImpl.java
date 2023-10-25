package com.example.microservice.service.serviceimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.microservice.dao.ProjectDao;
import com.example.microservice.dao.UserDao;
import com.example.microservice.model.ProjectList;
import com.example.microservice.model.UserInfo;
import com.example.microservice.service.ProjectService;
import com.example.microservice.shared.Response;

//logic side of the program
//Implements all the methods found in ProjectService from service/ProjectService.java
@Service
public class ProjectServiceImpl implements ProjectService {
    
    //Injected the interface ProjectDao from dao/ProjectDao.java to access all it's methods 
    @Autowired
    private ProjectDao projectDao;

    //Injected the interface UserDao from dao/UserDao.java to access all it's methods 
    @Autowired
    private UserDao userDao;

    //Overrides the method of projectList from ProjectService.java found in service/ProjectService.java
    @Override
    //Used ResponseEntity to leverage the use of ResponseEntity method to properly handle responses sent by this API.
    public List<ProjectList> projectList() {

        return projectDao.projectList();
    }

    @Override
    public List<Map<String, Object>> getAllMembersOfProject(String proj_id) {
        List<UserInfo> membersOfProject = projectDao.getAllMembersOfProject(proj_id);

        List<Map<String, Object>> allMembers = membersOfProject.stream()
                .map(member -> {
                    UserInfo user = userDao.getUserById(member.getEmp_id());
                    Map<String, Object> currentMembers = new HashMap<>();
                    currentMembers.put("emp_id", user.getEmp_id());
                    currentMembers.put("first_name", user.getFname());
                    currentMembers.put("last_name", user.getLname());
                    currentMembers.put("position_name", user.getPosition_name());
                    return currentMembers;
                }).collect(Collectors.toList());

        return allMembers;
    }
    
}
