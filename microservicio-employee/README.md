almacen los departamentos un postgreSQL con

Long id(generado por el sistema)
String firstName
String LastName
String email
Long departamentId

paquete controller se encarga de gestionar las solicitudes http que se reciben

paquete dto que se encarga de tener clases con diferentes datos para uso general

paquete entity se usa para referenciar la base de datos

repository se encarga de los mensajes CRUD

service gestio el contenido de la base de datos enviada desde el controllador y levantar el servicio para RestTemplate