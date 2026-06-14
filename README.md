# MiTienda – Sistema de Ventas

## Descripción
MiTienda es una aplicación de escritorio desarrollada en **JavaFX** que simula un sistema de gestión de ventas. Incluye login con roles, un dashboard con menú lateral y un módulo completo de gestión de productos (CRUD).

## Tecnologías utilizadas
- **Java 17+**
- **JavaFX 21** (Controls, FXML)
- **CSS** personalizado para estilos

## Funcionalidades implementadas
- ✅ Login funcional con usuario, contraseña y rol (admin / 1234 / Administrador)
- ✅ Menú lateral con navegación entre módulos
- ✅ Módulo Productos: Crear, Leer, Actualizar, Eliminar
- ✅ Búsqueda en tiempo real en la tabla de productos
- ✅ Badges de estado (Activo / Inactivo)
- ✅ Validación de formularios
- ✅ CSS aplicado globalmente (login + dashboard + tabla)

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
