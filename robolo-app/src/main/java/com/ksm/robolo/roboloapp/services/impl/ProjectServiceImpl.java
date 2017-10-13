package com.ksm.robolo.roboloapp.services.impl;

import com.ksm.robolo.roboloapp.domain.ProjectEntity;
import com.ksm.robolo.roboloapp.dto.Project;
import com.ksm.robolo.roboloapp.repository.ProjectRepository;
import com.ksm.robolo.roboloapp.services.ProjectService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService{

    private Logger logger = Logger.getLogger(ProjectServiceImpl.class);

    private ProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public List<Project> getAllProjects() {
        logger.info("get all projects called");
        List<ProjectEntity> projectEntityList = projectRepository.findAll();
        List<Project> projectList = new LinkedList<>();

        for (ProjectEntity projectEntity : projectEntityList) {
            projectList.add(convertProjectEntityToModel(projectEntity));
        }

        return projectList;
    }

    private Project convertProjectEntityToModel(ProjectEntity projectEntity) {
        Project project = new Project();
        project.setId(projectEntity.getId());
        project.setProjectName(projectEntity.getProjectName());

        //TODO complete the converter
        return project;
    }
}
