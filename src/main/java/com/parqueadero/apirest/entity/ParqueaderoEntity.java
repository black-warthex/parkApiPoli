package com.parqueadero.apirest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "info")
public class ParqueaderoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "placa")
    private String placa;

    @Column(name = "hora_inicio")
    private String inicio;

    @Column(name = "hora_fin")
    private String fin;

    @Column(name = "nombre")
    private String nombre;

}
