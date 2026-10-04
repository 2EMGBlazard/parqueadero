package com.parqueadero.parqueadero.controller;

import com.parqueadero.parqueadero.model.Espacio;
import com.parqueadero.parqueadero.service.ParqueaderoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/parqueadero")
@CrossOrigin(origins = "*")
public class ParqueaderoController {

    private final ParqueaderoService service;

    public ParqueaderoController(ParqueaderoService service) {
        this.service = service;
    }

    @GetMapping("/espacios")
    public List<Espacio> obtenerEspacios() {
        return service.obtenerTodos();
    }

    @GetMapping("/resumen")
    public Map<String, Integer> obtenerResumen() {
        return service.obtenerResumen();
    }

    @PutMapping("/cambiar/{id}")
    public Espacio cambiarEstado(@PathVariable int id,
                                 @RequestParam String estado,
                                 @RequestParam(required = false) String usuario) {
        return service.cambiarEstado(id, estado, usuario);
    }

    @GetMapping("/cobrar")
    public double calcularCobro(@RequestParam int horas) {
        return service.calcularTarifa(horas);
    }
}