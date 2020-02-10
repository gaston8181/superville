# superville

#Proyecto Springboot
Este proyecto consiste en un CRUD a una base de datos de postgress, expuesto mediante una API ReST. 
El objetivo es proporcionar un quickstart siguiendo convenciones y buenas prácticas en cuanto a la estructura y contenido de una aplicación springboot.
•	Importa dependencias de springboot
•	Define la versión 2.2.x como base de springboot
•	Sugiere la utilización de Junit para tests unitarios y Arquillian para tests de integración ( debido al poco tiempo dedica al proyecto, no pudieron terminarse ) 
•	Sugiere la utilización de la especificación Swagger, mediante la implementación de Springfox, para exponer la documentación de la API
Para ejecutar el proyecto en forma local se requiere una base postgress, y ejecutar los import del sql provistos. Luego se debería bajar el código compartido de github e importarlo al IDE como un proyecto maven existente. Luego ejecutar el siguiente comando:
mvn clean install –Dmaven.test.skip=true
El proyecto cuenta con la posibilidad de utilizarse desde heroku con los cuidados previos de los datos ingresados, debido a que no contiene ningún tipo de validación y podría fallar.
No deberían repetirse los id de los clientes, buscar id que no existen,  o obtener relaciones sin los padres asignados. Los insert no poseen autogenerador para Personas por los cual se debería tener el cuidado previo.
Como requisito previo se requiere conocimientos de Rest, Spring Boot, Maven, Postgress, Heroku.
En el proyecto se deberían proveer a futuro una configuración básica para correr algunos tests sobre el CRUD creado.
Para obtener la java doc del proyecto ejecutar las siguientes líneas de maven : 
 mvn javadoc:javadoc

Para obtener información de swagger ingresar a una url 
Localhost:8080/swagger-ui.html
Desde Heroku seria:
https://gastonsuperville.herokuapp.com/swagger-ui.html#/totalizador-controller
•	Sugiero consultarlo local, no volví a desplegar el código con los cambios en la documentación.

El host de HEROKU es :

https://gastonsuperville.herokuapp.com

Se provee un archivo postman donde se encuentran los endpoint. Verificar que alguno apuntan a localhost, en casos de necesitar apuntar a HEROKU.


La url de GITHUB es:

https://github.com/gaston8181/superville.git
