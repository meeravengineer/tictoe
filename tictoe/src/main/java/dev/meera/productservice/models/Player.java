package dev.meera.productservice.models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class Player  {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @Id private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;
}
