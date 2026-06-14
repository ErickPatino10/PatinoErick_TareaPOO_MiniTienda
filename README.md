# MiTienda – Sistema de Ventas

## Descripción
MiTienda es una aplicación de escritorio desarrollada en **JavaFX** que simula un sistema de gestión de ventas. Incluye login con roles, un dashboard con menú lateral y un módulo completo de gestión de productos (CRUD).

## Tecnologías utilizadas
- **Java 17+**
- **JavaFX 21** (Controls, FXML)
- **CSS** personalizado para estilos

## Funcionalidades implementadas
- ✅ Login funcional con usuario, contraseña y rol (admin / 1234 / Administrador)
- <img width="518" height="737" alt="image" src="https://github.com/user-attachments/assets/6593b322-8045-4d9c-a6d9-28ead7acd8cb" />
- ✅ Menú lateral con navegación entre módulos
- <img width="272" height="1025" alt="image" src="https://github.com/user-attachments/assets/37edd7e4-68fa-42f2-adda-c938aa6d5b14" />

- ✅ Módulo Productos: Crear, Leer, Actualizar, Eliminar
- <img width="1028" height="372" alt="image" src="https://github.com/user-attachments/assets/2dff7a40-2e02-4706-ad7b-efa4aed49882" />

- ✅ Búsqueda en tiempo real en la tabla de productos
- <img width="1035" height="253" alt="image" src="https://github.com/user-attachments/assets/7aa46990-c60b-40fe-b091-265eb740214c" />

- ✅ Badges de estado (Activo / Inactivo)
- <img width="360" height="133" alt="image" src="https://github.com/user-attachments/assets/e428f081-0f71-4c26-9d74-2cf868909200" />

- ✅ Validación de formularios
- ✅ CSS aplicado globalmente (login + dashboard + tabla)
- <img width="1363" height="1061" alt="image" src="https://github.com/user-attachments/assets/6d367afe-61b2-4f6d-9de2-ec5458d401dd" />


## Estructura de carpetas
```
mitienda/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/
        │   ├── module-info.java
        │   └── com/example/mitienda/
        │       ├── Main.java
        │       ├── LoginController.java
        │       ├── DashboardController.java
        │       ├── ProductoController.java
        │       └── Producto.java
        └── resources/
            └── com/example/mitienda/
                ├── Login.fxml
                ├── Dashboard.fxml
                ├── Productos.fxml
                └── estilos.css
```

## Instrucciones para ejecutar

### Requisitos
- JDK 17 o superior
- Maven 3.8+

### Pasos
```bash
# 1. Clonar el repositorio
git clone <URL_DEL_REPOSITORIO>
cd mitienda

# 2. Compilar y ejecutar con Maven
mvn javafx:run
```

### Credenciales de acceso
| Campo     | Valor           |
|-----------|-----------------|
| Usuario   | admin           |
| Contraseña| 1234            |
| Rol       | Administrador   |

## Captura del dashboard
> *(Agrega aquí una captura de pantalla del dashboard una vez ejecutado)*
> <img width="1363" height="1061" alt="image" src="https://github.com/user-attachments/assets/cf5ec932-08f6-4e42-afb2-297905d9e7c7" />

