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
    @Column(name = "nota", nullable = false, precision = 10, scale = 2)
    public BigDecimal nota;
    public Integer getIdalumno() {
        return idalumno;
    }
    public void setIdalumno(Integer idalumno) {
        this.idalumno = idalumno;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public BigDecimal getNota() {
        return nota;
    }
    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }
    

}
