package com.dev.crud.app_crud.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@Data // Para gerar os getters, setters, equals e hashcode
@NoArgsConstructor // Construtor sem argumentos, exigido pelo JPA
@AllArgsConstructor // Construtor com todos os campos
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;
}
