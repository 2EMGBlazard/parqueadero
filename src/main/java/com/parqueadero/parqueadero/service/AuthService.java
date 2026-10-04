package com.parqueadero.parqueadero.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public boolean validarCredenciales(String usuario, String password) {
        if (usuario == null || password == null) return false;

        // Compara sin importar espacios en blanco
        return usuario.trim().equalsIgnoreCase("admin") && password.trim().equals("admin123");
    }
}