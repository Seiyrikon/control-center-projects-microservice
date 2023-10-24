package com.example.microservice.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//Variables defined here will be used as the container of the data's to be displayed.
public class ProjectList {
    private Long proj_id;
    private String proj_name;
    // private List<String> proj_manager;
    private String client_name;
    private Date start_date;
    private Date end_date;
    private String dev_type_name;
    // private List<String> proj_dev_phase;
    // private List<String> proj_tech;
    private int members;
    private String proj_status_name;
}
