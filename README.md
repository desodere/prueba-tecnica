# Gestion de tareas API

## Descripción
Aplicación backend de gestión de tareas.
Permite a los usuarios :
-Crear nuevas tareas
-Actualizar tareas
-Buscar tarea por ID
-Buscar todas las tareas
-Eliminar tarea

# tecnologias utilizadas
- Java
- Spring Boot
- Maven
- Base de datos H2

## Requisitos
- Java 17
- Maven 3.3.3

# Acceso al proyecto
https://github.com/desodere/prueba-tecnica

#Endpoints de la API
Se recomienda utilizar Postman como herramienta para comprobar el funcionamiento de la APi.

Método	Ruta		Descripción
POST	/api/task	Crear una nueva tarea.
GET	/api/task	Obtener todas las tareas.
GET	/api/task/{id}	Obtener una tarea por su ID.
PUT	/api/task/{id}	Actualizar el estado de una tarea existente.
DELETE	/api/task/{id}	Eliminar una tarea por su ID.


#Base de datos
- URL:localhost:8080/h2-ui
- JDBC URL: jdbc:h2:mem:testdb
- Usuario: sa
- Contraseña: (vacío)


#Pruebas
La aplicación incluye una pruebas unitarias.
Se encuenta en \src\test\java\com\nauth\apirest\ApiRestApplicationTests


#Importante
Clase Task tiene como atributos:
-id : clave unica de la tarea
-descripción : tipo String, descripción de la tarea
-state : tipo String, se usara con las siguientes convención (A)completado, (I)no-completado, (E)eliminado.

#Autor
Darwin Mojica
ddmojica8@gmail.com



