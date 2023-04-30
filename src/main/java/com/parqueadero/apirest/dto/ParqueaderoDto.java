package com.parqueadero.apirest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ParqueaderoDto {
    private long id;
    private String placa;
    private String inicio;
    private String fin;
    private String nombre;
}
