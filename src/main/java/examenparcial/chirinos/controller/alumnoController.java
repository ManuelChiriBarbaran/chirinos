package examenparcial.chirinos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import examenparcial.chirinos.model.alumnoModel;
import examenparcial.chirinos.repository.IAlumnooRepository;
import examenparcial.chirinos.services.AlumnoService;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("alumno")
public class alumnoController {
    @Autowired
    AlumnoService alumnoService;
    IAlumnooRepository alumnoRepository;

    @GetMapping("/getAll")
    public List<alumnoModel> getAll() {
        return alumnoService.findAll();
    }

    @GetMapping("/{id}")
    public alumnoModel obtener(@PathVariable Integer id) {
        return alumnoService.findById(id);
    }

    @PostMapping("/create")
    public alumnoModel create(@RequestBody alumnoModel model) {
        return alumnoService.add(model);
    }

    @PutMapping("/{id}")
    public alumnoModel update(@PathVariable Integer id, @RequestBody alumnoModel model) {
        return alumnoService.update(id, model);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id) {
        return alumnoService.delete(id);
    }
}
