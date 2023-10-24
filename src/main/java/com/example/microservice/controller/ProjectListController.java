package com.example.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.microservice.service.ProjectService;

@Controller
@RequestMapping("/project")
//endpoints for the API, used /project as the base url.
public class ProjectListController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/")
    public String iBringYouToLife(Model model) {
        model.addAttribute("listOfProjects", projectService.projectList());
        return "index";
    }

    @GetMapping("/all")
    public String projectList(Model model) {
        model.addAttribute("listOfProjects", projectService.projectList());
        return "fragments/ProjectTable";
    }
}
