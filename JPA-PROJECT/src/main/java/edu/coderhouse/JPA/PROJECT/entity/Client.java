package java_coderhouse.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.security.PrivateKey;
import java.time.LocalDate;

@Entity
@Table(name = "CLIENT")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int id;

    public Client(int id, String nombre, String apellido, int dni, LocalDate fecha) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha = fecha;
    }

    @Column(name = "NOMBRE")
    @Getter
    @Setter
    private String nombre;

    @Column(name = "APELLIDO")
    @Getter
    @Setter
    private String apellido;

    @Column(name = "DNI")
    @Getter
    @Setter
    private int dni;

    @Column(name = "FECHA")
    @Getter
    @Setter
    private LocalDate fecha;
}
