package examenparcial.chirinos.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alumno")
public class alumnoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idalumno")
    public Integer idalumno;

    @Column(name = "nombre")
    public String nombre;

    @Column(name = "nota", columnDefinition = "DECIMAL(10,2)")
   public BigDecimal nota;

}
