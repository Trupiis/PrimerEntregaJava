package edu.coderhouse.JPA.PROJECT.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int id;

    @Column(name = "DESCRIPCION")
    @Getter
    @Setter
    private String descripcion;

    @Column(name = "STOCK")
    @Getter
    @Setter
    private int stock;

    @Column(name = "PRECIO")
    @Getter
    @Setter
    private String precio;

    @Column(name = "COLOR")
    @Getter
    @Setter
    private String color;

    @Column(name = "TALLE")
    @Getter
    @Setter
    private String sizes;
}