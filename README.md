# Api Rest Parqueadero Poligran
### Este es un ejemplo de un api rest con metodos post y get realizados en spring boot 

## Para ejecutarlo se deben realizar los siguientes pasos:

1. Descargar el repositorio y descargar las dependencias.

2. Modificar las dependencias para el uso de la Base de datos que se desea utilizar, original mente viene con el driver para SQL Server.

3. Crear Base de datos con el script:
  ```
  CREATE DATABASE parqueadero;
  
  USE parqueadero;
  
  CREATE TABLE info(
  id INT IDENTITY(1,1) PRIMARY KEY,
  placa VARCHAR(6),
  nombre VARCHAR(MAX),
  hora_inicio datetime,
  hora_fin datetime
  );
  ```
  
  el campo Id puede variar dependiente del tipo de Base de datos, por lo cual se recomienda usar el autoincrementable dependiente de la DB elegida.
  
  4. Modificar el properties para la conexion con la base de datos.
  
  5. Ejecutar el microservicio.
  
  Para probar este microservicio de forma rapida se puede hacer mediante postman.
