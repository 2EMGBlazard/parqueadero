package com.parqueadero.parqueadero.controller;

import com.parqueadero.parqueadero.service.AuthService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    @CrossOrigin(origins = "*")
    public Map<String, Object> login(@RequestBody Map<String, String> credentials) {
        String usuario = credentials.get("usuario");
        String password = credentials.get("password");

        boolean esValido = authService.validarCredenciales(usuario, password);

        Map<String, Object> response = new HashMap<>();
        response.put("autenticado", esValido);

        if (esValido) {
            response.put("mensaje", "Acceso concedido");
            response.put("token", "ADMIN_SESSION_TOKEN_SECURE_98765");
        } else {
            response.put("mensaje", "Usuario o contraseña incorrectos");
        }

        return response;
    }
}