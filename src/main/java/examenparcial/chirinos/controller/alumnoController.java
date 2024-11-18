package examenparcial.chirinos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import examenparcial.chirinos.model.alumnoModel;
import examenparcial.chirinos.repository.IAlumnooRepository;
import examenparcial.chirinos.services.AlumnoService;

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
@GetMapping("/{idalumno}")
    public ResponseEntity<alumnoModel> getalumnoById(@PathVariable Integer idalumno) {
        Optional<alumnoModel> alumnoModel = alumnoRepository.findById(idalumno);
        return alumnoModel.map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping("/create")
    public alumnoModel create(@RequestBody alumnoModel model) {
        return alumnoService.add(model);
    }


}
