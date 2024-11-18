package examenparcial.chirinos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import examenparcial.chirinos.model.alumnoModel;
import examenparcial.chirinos.repository.IAlumnooRepository;

@Service
public class AlumnoService implements IAlumnoService{

    @Autowired
    IAlumnooRepository repository;

    @Override
    public alumnoModel add(alumnoModel model) {
       return repository.save(model);
    }

    @Override
    public alumnoModel update(alumnoModel model) {
        return repository.save(model);  
    }

    @Override
    public boolean delete(int id){
        repository.deleteById(id);
        return true;    
    }

    @Override
    public List<alumnoModel> findAll() {
        return (List<alumnoModel>) repository.findAll();
    }

    @Override
    public alumnoModel findById(int id) {
        return repository.findById(id).get(); 
    }
    
}
