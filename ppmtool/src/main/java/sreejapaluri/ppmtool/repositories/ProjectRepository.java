package sreejapaluri.ppmtool.repositories;

import org.springframework.stereotype.Repository;
import sreejapaluri.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;

@Repository

public interface ProjectRepository extends CrudRepository<Project, Long> {



    Project findByProjectIdentifier(String projectId);



    @Override

    Iterable<Project> findAll();

    Iterable<Project> findAllByProjectLeader(String username);

}
