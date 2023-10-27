package com.example.microservice.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.microservice.model.Project;
import com.example.microservice.model.ProjectList;
import com.example.microservice.model.UserInfo;

@Mapper
//This interface connects the ProjectMapper.xml found in resources/mapper/ProjectMapper.xml
public interface ProjectDao {
    //Returns list of project information fetched from the database.
    List<ProjectList> projectList();

    //Returns list of user information fetched from the database.
    List<UserInfo> getAllMembersOfProject(String proj_id);

    Project getProjectById(String proj_id);
}
