package com.example.microservice.shared;

import java.util.List;

import com.example.microservice.model.ProjectList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//Used as a return type for service impl.
public class Response {
    //Model for project table, this is from model/ProjectList.java
    private List<ProjectList> projectList;
    //Used to return your error messages.
    private String errorMessage;
}
