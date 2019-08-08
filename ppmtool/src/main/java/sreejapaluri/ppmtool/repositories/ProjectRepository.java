package sreejapaluri.ppmtool.repositories;

import org.springframework.stereotype.Repository;
import sreejapaluri.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>
{
    @Override
    Iterable<Project> findAllById(Iterable<Long> longs);
}
