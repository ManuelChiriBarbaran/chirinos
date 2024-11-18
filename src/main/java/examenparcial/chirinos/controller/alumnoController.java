package examenparcial.chirinos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import examenparcial.chirinos.model.alumnoModel;
import examenparcial.chirinos.services.AlumnoService;


@RestController
@RequestMapping("alumno")
public class alumnoController {
    @Autowired
    AlumnoService alumnoService;
    @GetMapping("/getAll")
    public List<alumnoModel> getAll() {
        return alumnoService.findAll();
    }
    @PostMapping("/create")
    public alumnoModel create(@RequestBody alumnoModel model) {
        return alumnoService.add(model);
    }
}
