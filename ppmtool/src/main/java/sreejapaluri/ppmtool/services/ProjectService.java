package sreejapaluri.ppmtool.services;

import sreejapaluri.ppmtool.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sreejapaluri.ppmtool.repositories.ProjectRepository;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject( Project project){
        return projectRepository.save(project);

    }

}
