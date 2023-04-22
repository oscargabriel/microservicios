microservicio

servicio departament que almacena los departamentos en una base de datos propia

servicio employee que almacena los datos de los empleados y el id del departamento

employee recibe solicitudes http por un ente externo

desde employee se hacen solicitudes http a departament

(no hay implementado un filtro para que departament solo sea accecible desde employee)











