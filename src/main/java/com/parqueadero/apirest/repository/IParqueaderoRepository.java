package com.parqueadero.apirest.repository;

import com.parqueadero.apirest.entity.ParqueaderoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IParqueaderoRepository extends JpaRepository<ParqueaderoEntity, String> {

    List<ParqueaderoEntity> findAll();

    List<ParqueaderoEntity> findByNombre(String nombre);

    List<ParqueaderoEntity> findByPlaca(String placa);

}
