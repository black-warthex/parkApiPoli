package com.parqueadero.apirest.services;

import com.parqueadero.apirest.dto.ResponseDto;
import com.parqueadero.apirest.entity.ParqueaderoEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IParqueaderoService {
    ResponseDto addEntrada(ParqueaderoEntity parqueaderoEntity);

    List<ParqueaderoEntity> getLista();

    List<ParqueaderoEntity> findByNombre(String nombre);

    List<ParqueaderoEntity> findByPlaca(String placa);

}
