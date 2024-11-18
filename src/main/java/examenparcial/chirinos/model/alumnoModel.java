package examenparcial.chirinos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alumno")
public class alumnoModel {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idalumno")
    public Integer idalumno;

    @Column(name = "nombre")
    public String nombre;
}
