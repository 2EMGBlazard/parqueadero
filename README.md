# 🚗 Sistema de Gestión de Parqueadero

Un sistema web intuitivo y dinámico para la gestión de estacionamientos en tiempo real, desarrollado con **Spring Boot** en el backend y **HTML/CSS/JavaScript vanilla** en el frontend.

Permite administrar celdas diferenciadas para **carros (30 cupos)** y **motos (10 cupos)**, facilitando las reservas para clientes y un panel de control completo para administradores.
<img width="1912" height="558" alt="image" src="https://github.com/user-attachments/assets/3a698383-a426-4eb4-b148-66eb4b2c36d3" />
<img width="380" height="325" alt="image" src="https://github.com/user-attachments/assets/88adc7a3-1e72-41c5-84fc-df0e1d98baad" />
<img width="1899" height="906" alt="image" src="https://github.com/user-attachments/assets/4a2406b9-d2d7-458d-8e31-d51b055f0199" />
<img width="1226" height="737" alt="image" src="https://github.com/user-attachments/assets/42f1ba5d-0839-44ee-942b-ba78dc485e1b" />
<img width="583" height="177" alt="image" src="https://github.com/user-attachments/assets/ee389679-3ff0-4817-b843-a38f810e031d" />

---

## 🚀 Características Principales

### 👤 Vista del Cliente (`index.html`)
- **Reserva en tiempo real:** Selección de celdas libres divididas por tipo de vehículo (Carro / Moto).
- **Actualización dinámica:** Filtrado automático de celdas ocupadas/reservadas.
- **Acceso rápido a administración:** Modal integrado para inicio de sesión seguro.

### 🛡️ Panel de Administración (`dashboard.html`)
- **Autenticación:** Módulo de inicio de sesión con token de sesión temporal.
- **Visualización dividida:** Tablas independientes en paralelo para monitorear los 30 puestos de carro y 10 de moto.
- **Gestión de estados:** Capacidad para alternar celdas entre estados `VACIO`, `OCUPADO` y `RESERVADO` asignando usuario/placa.
- **Calculadora de Cobro:** Cálculo automático de tarifa según la cantidad de horas estacionado.

---

## 🛠️ Tecnologías Utilizadas

- **Backend:** Java 17+, Spring Boot (Spring Web)
- **Frontend:** HTML5, CSS3, JavaScript (Fetch API)
- **Gestor de Dependencias:** Maven
- **Estilos:** CSS Grid & Flexbox integrados (Responsive)

---

## 📂 Estructura del Proyecto

```text
src/main/java/com/parqueadero/parqueadero/
├── controller/
│   ├── AuthController.java        # API de autenticación admin
│   └── ParqueaderoController.java # API REST de gestión de celdas y cobros
├── model/
│   └── Espacio.java               # Modelo de datos (id, tipo, estado, usuario)
└── service/
    ├── AuthService.java           # Lógica de validación de credenciales
    └── ParqueaderoService.java     # Gestión en memoria de los 40 espacios

src/main/resources/static/
├── index.html                     # Interfaz pública para el cliente
└── admin/
    └── dashboard.html             # Panel privado de administración
