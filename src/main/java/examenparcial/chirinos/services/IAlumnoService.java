package examenparcial.chirinos.services;

import java.util.List;

import examenparcial.chirinos.model.alumnoModel;
public interface IAlumnoService {

    public alumnoModel add(alumnoModel model);

    public alumnoModel update(alumnoModel model);

    public boolean delete(int id);

    public List<alumnoModel> findAll();

    public alumnoModel findById(int id);
    
}
