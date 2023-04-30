package com.parqueadero.apirest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDto {

    private Boolean respuesta;
    private String mensaje;
}
