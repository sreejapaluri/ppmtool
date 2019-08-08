package sreejapaluri.ppmtool.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sreejapaluri.ppmtool.domain.Project;
import sreejapaluri.ppmtool.services.MapValidationErrorService;
import sreejapaluri.ppmtool.services.ProjectService;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;
    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    @PostMapping("")
    public ResponseEntity<?> creatNewProject(@Valid @RequestBody Project project, BindingResult result){
        ResponseEntity<?> erroeMap = mapValidationErrorService.MapValidationService(result);
        if(erroeMap!=null) return erroeMap;
        



        Project project1= projectService.saveOrUpdateProject(project);
        return new ResponseEntity<Project>(project , HttpStatus.CREATED);
    }

}