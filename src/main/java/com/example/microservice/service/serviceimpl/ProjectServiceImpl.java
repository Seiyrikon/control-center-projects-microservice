package com.example.microservice.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.microservice.dao.ProjectDao;
import com.example.microservice.model.ProjectList;
import com.example.microservice.service.ProjectService;
import com.example.microservice.shared.Response;

//logic side of the program
//Implements all the methods found in ProjectService from service/ProjectService.java
@Service
public class ProjectServiceImpl implements ProjectService {
    
    //Injected the interface ProjectDao from dao/ProjectDao.java to access all it's methods 
    @Autowired
    private ProjectDao projectDao;

    //Initialization of object for response using the Response class found in shared/Response.java
    Response response = new Response();

    // //Overrides the method of projectList from ProjectService.java found in service/ProjectService.java
    // @Override
    // //Used ResponseEntity to leverage the use of ResponseEntity method to properly handle responses sent by this API.
    // public ResponseEntity<Response> projectList() {
    //     //Saving the value returned by the method of projectList from ProjectDao to the response object.
    //     response.setProjectList(projectDao.projectList());

    //     //Checks if the object has value and returns a success response with the value alongside it.
    //     if(response.getProjectList() != null) {
    //         return ResponseEntity.ok(response);
    //     } else {
    //         //Error handling.
    //         response.setErrorMessage("Something went wrong. Check your database or spring boot if they are running properly. Try reloading your spring boot app.");
    //         return ResponseEntity.internalServerError().body(response);
    //     }
    // }

    //Overrides the method of projectList from ProjectService.java found in service/ProjectService.java
    @Override
    //Used ResponseEntity to leverage the use of ResponseEntity method to properly handle responses sent by this API.
    public List<ProjectList> projectList() {

        return projectDao.projectList();
    }

    
}
