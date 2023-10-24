package com.example.microservice.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.microservice.model.ProjectList;

@Mapper
//This interface connects the ProjectMapper.xml found in resources/mapper/ProjectMapper.xml
public interface ProjectDao {
    //Returns list of information fetched from the database.
    List<ProjectList> projectList();
}
