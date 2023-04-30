package com.parqueadero.apirest.utility;

import com.parqueadero.apirest.dto.ParqueaderoDto;
import com.parqueadero.apirest.entity.ParqueaderoEntity;

public class DtoToEntity {
    public ParqueaderoEntity toEntity(ParqueaderoDto parqueadero) {

        return new ParqueaderoEntity(
                parqueadero.getId(),
                parqueadero.getPlaca(),
                parqueadero.getInicio(),
                parqueadero.getFin(),
                parqueadero.getNombre()
        );
    }

}
