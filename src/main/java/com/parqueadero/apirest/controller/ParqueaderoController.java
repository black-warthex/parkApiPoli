package com.parqueadero.apirest.controller;

import com.parqueadero.apirest.dto.ParqueaderoDto;
import com.parqueadero.apirest.dto.ResponseDto;
import com.parqueadero.apirest.entity.ParqueaderoEntity;
import com.parqueadero.apirest.services.IParqueaderoService;
import com.parqueadero.apirest.utility.DtoToEntity;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/park")
public class ParqueaderoController {
    @Autowired
    private IParqueaderoService service;
    private DtoToEntity toEntity = new DtoToEntity();

    @PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<ResponseDto> addEntrada(@RequestBody @NonNull ParqueaderoDto parqueadero) {
        return new ResponseEntity<>(service.addEntrada((toEntity.toEntity(parqueadero))), HttpStatus.OK);
    }

    @GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<ParqueaderoEntity>> getParqueadero() {
        return new ResponseEntity<>(service.getLista(), HttpStatus.OK);
    }

    @GetMapping(path = "/findByName", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<ParqueaderoEntity>> findByName(@RequestParam (name = "nombre") String nombre){
        return new ResponseEntity<>(service.findByNombre(nombre),HttpStatus.OK);
    }

    @GetMapping(path = "/findByPlaca",produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<ParqueaderoEntity>> findByPlaca(@RequestParam (name = "placa") String placa){
        return new ResponseEntity<>(service.findByPlaca(placa),HttpStatus.OK);
    }

}
