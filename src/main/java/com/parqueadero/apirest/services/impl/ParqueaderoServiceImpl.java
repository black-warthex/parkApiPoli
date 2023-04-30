package com.parqueadero.apirest.services.impl;

import com.parqueadero.apirest.dto.ResponseDto;
import com.parqueadero.apirest.entity.ParqueaderoEntity;
import com.parqueadero.apirest.repository.IParqueaderoRepository;
import com.parqueadero.apirest.services.IParqueaderoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ParqueaderoServiceImpl implements IParqueaderoService {

    @Autowired
    private IParqueaderoRepository repository;

    @Override
    public ResponseDto addEntrada(ParqueaderoEntity parqueaderoEntity) {

        repository.save(parqueaderoEntity);
        return new ResponseDto(true, " otro ingreso");
    }

    @Override
    public List<ParqueaderoEntity> getLista() {
        return repository.findAll();
    }

    @Override
    public List<ParqueaderoEntity> findByNombre(String nombre){
        return repository.findByNombre(nombre);
    }

    @Override
    public List<ParqueaderoEntity> findByPlaca(String placa){
        return repository.findByPlaca(placa);
    }

}
