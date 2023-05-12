package com.example.ktmaantee.KtmaanteeApplication;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Soiduk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nimetus;

    private double kaal;

    @ManyToOne
    @JoinColumn(name = "maantee_id")
    private Maantee maantee;

}