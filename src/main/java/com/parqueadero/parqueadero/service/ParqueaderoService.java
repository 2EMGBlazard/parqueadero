package com.parqueadero.parqueadero.service;

import com.parqueadero.parqueadero.model.Espacio;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ParqueaderoService {

    private final List<Espacio> espacios = new ArrayList<>();

    public ParqueaderoService() {
        // 30 puestos para CARRO (IDs: 1 a 30)
        for (int i = 1; i <= 30; i++) {
            espacios.add(new Espacio(i, "CARRO", "VACIO", null));
        }

        // 10 puestos para MOTO (IDs: 31 a 40)
        for (int i = 31; i <= 40; i++) {
            espacios.add(new Espacio(i, "MOTO", "VACIO", null));
        }
    }

    public List<Espacio> obtenerTodos() {
        return espacios;
    }

    public Map<String, Integer> obtenerResumen() {
        int vacios = 0, ocupados = 0, reservados = 0;
        for (Espacio e : espacios) {
            if ("VACIO".equalsIgnoreCase(e.getEstado())) vacios++;
            else if ("OCUPADO".equalsIgnoreCase(e.getEstado())) ocupados++;
            else if ("RESERVADO".equalsIgnoreCase(e.getEstado())) reservados++;
        }
        Map<String, Integer> resumen = new HashMap<>();
        resumen.put("vacios", vacios);
        resumen.put("ocupados", ocupados);
        resumen.put("reservados", reservados);
        return resumen;
    }

    public Espacio cambiarEstado(int id, String estado, String usuario) {
        for (Espacio e : espacios) {
            if (e.getId() == id) {
                e.setEstado(estado);
                e.setUsuario(usuario);
                return e;
            }
        }
        return null;
    }

    public double calcularTarifa(int horas) {
        return Math.max(0, horas) * 2000.0;
    }
}