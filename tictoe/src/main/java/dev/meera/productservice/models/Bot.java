package dev.meera.productservice.models;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Bot {
    @Id
    @Column(name ="id")
    private Long id;

    @OneToOne()
    @JoinColumn(name="player_id",referencedColumnName = "id")
    private Player player;
    @Column(name="mrank")
    private int mrank;

    // constructor, getters, setters
}