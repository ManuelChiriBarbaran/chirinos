package examenparcial.chirinos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import examenparcial.chirinos.model.alumnoModel;

@Repository
public interface IAlumnooRepository
        extends CrudRepository<alumnoModel, Integer> {
                
}