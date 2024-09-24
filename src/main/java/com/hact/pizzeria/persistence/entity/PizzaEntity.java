package com.hact.pizzeria.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pizza", schema = "pizzeria")
@Getter
@Setter
@NoArgsConstructor
public class PizzaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pizza", nullable = false)
    private Integer idPizza;

    @Column(nullable = false, length = 30, unique = true)
    private String name;

    @Column(nullable = false, length = 150)
    private String description;

    @Column(nullable = false, columnDefinition = "decimal(5,2)")
    private Double price;

    @Column(columnDefinition = "boolean")
    private Boolean vegetarian;

    @Column(columnDefinition = "boolean")
    private Boolean vegan;

    @Column(columnDefinition = "boolean", nullable = false)
    private Boolean available;

}
