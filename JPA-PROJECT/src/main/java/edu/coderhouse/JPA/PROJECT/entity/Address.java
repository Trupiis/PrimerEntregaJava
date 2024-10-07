package java_coderhouse.jpa.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ADDRESS")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int id;

    @Column(name = "CALLE")
    @Getter
    @Setter
    private String calle;

    @Column(name = "NUMERO")
    @Getter
    @Setter
    private int numero;

    @Column(name = "CP")
    @Getter
    @Setter
    private String cp;

    @Column(name = "PROVINCIA")
    @Getter
    @Setter
    private String provincia;

    @Column(name = "CIUDAD")
    @Getter
    @Setter
    private String ciudad;
}