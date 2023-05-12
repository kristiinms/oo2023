package com.example.ktmaantee;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Maantee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maantee_id")
    private int id;

    private String nimetus;

    private double pikkus;

    @OneToMany(mappedBy = "maantee")
    private List<Soiduk> maanteeSoidukid = new ArrayList<>();
}