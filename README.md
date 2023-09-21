# LAB05

# INTEGRANTES
### Santiago Parra
### Gabriel Alejandro Silva Lozada

- PARTE 1.
 

### PARTE I. - JUGANDO A SER UN CLIENTE HTTP
1. Abra una terminal Linux o consola de comandos Windows.
2. Realice una conexión síncrona TCP/IP a través de Telnet al siguiente servidor:
- Host: www.escuelaing.edu.co
- Puerto: 80
Teniendo en cuenta los parámetros del comando telnet:
 
  

  
```sh
$ telnet HOST PORT
```
  > Conexion a www.escuelaing.edu.co:
  
   ![image](https://github.com/Parralol/LAB05/assets/110953563/ea405d78-87e4-4afc-b35f-5dcefa590db1)


    
3. Antes de que el servidor cierre la conexión por falta de comunicación:

Revise el RFC del protocolo HTTP, sobre cómo realizar una petición GET.
Debe lucir más o menos de esta forma:

```yml
GET /this-is-the-url/with-a-resource.html HTTP/1.0
Host: www.escuelaing.edu.co
```

Con esto, solicite al servidor el recurso `sssss/abc.html`, usando la versión 1.0 de HTTP.

Asegúrese de presionar ENTER dos veces después de ingresar el comando.

Revise el resultado obtenido.

 > Resultado obtenido:

![image](https://github.com/Parralol/LAB05/assets/110953563/737d35c0-0e7d-436e-be65-b867decc62aa)

- ¿Qué codigo de error sale?, revise el significado del mismo en la lista de códigos de estado HTTP.
  
  
- ¿Qué otros códigos de error existen?, ¿En qué caso se manejarán?

  
- Responder en el README.md según lo indicado en la última sección de este laboratorio (ENTREGA).
  

4. Realice una nueva conexión con telnet, esta vez a:
```yml
Host: www.httpbin.org
Puerto: 80
Versión HTTP: 1.1
```

Ahora, solicite (GET) el recurso /html. ¿Qué se obtiene como resultado?

![image](https://github.com/Parralol/LAB05/assets/110953563/c0a0972e-68e0-4cd8-888b-d309b4d69f69)


¡Muy bien!, ¡Acaba de usar del protocolo HTTP sin un navegador Web!. Cada vez que se usa un navegador, éste se conecta a un servidor HTTP, envía peticiones
del protocolo HTTP, espera el resultado de las mismas, y si se trata de contenido HTML lo interpreta y dibuja.

5. Seleccione el contenido HTML de la respuesta y copielo al cortapapeles `CTRL-SHIFT-C`. Ejecute el comando wc (word count) para contar palabras con la
opción -c para contar el número de caracteres:
```sh
$ wc -c
```

Pegue el contenido del portapapeles con `CTRL-SHIFT-V` y presione `CTRL-D` (fin de archivo de Linux). Si no termina el comando `wc` presione `CTRL-D`
de nuevo. No presione mas de dos veces CTRL-D indica que se termino la entrada y puede cerrarle la terminal. Debe salir el resultado de la cantidad de
caracteres que tiene el contenido HTML que respondió el servidor.

![image](https://github.com/Parralol/LAB05/assets/110953563/06314050-ea81-42bc-97ff-96d201c0b785)

Claro está, las peticiones GET son insuficientes en muchos casos. Investigue: ¿Cuál esla diferencia entre los verbos GET y POST? ¿Qué otros tipos de
peticiones existen?
7. En la practica no se utiliza telnet para hacer peticiones a sitios web sino el comando curl con ayuda de la linea de comandos: 
```sh
$ curl "www.httpbin.org"
```
Utilice ahora el parámetro -v y con el parámetro -i:

```sh
$ curl -v www.httpbin.org
$ curl -i www.httpbin.org
```
¿Cuáles son las diferencias con los diferentes parámetros?

- PARTE 2 HACIENDO UNA APLICACIÓN WEB DINÁMICA USANDO EL PATRÓN MVC.
  ### PARTE II. - HACIENDO UNA APLICACIÓN WEB DINÁMICA USANDO EL PATRÓN MVC
En este ejercicio, va a implementar una aplicación Web muy básica, haciendo uso de spring MVC.

Para esto usaremos la documentación oficial de Spring con que que aprenderemos las funciones básicas de este framework https://spring.io/guides/gs/serving-web-content/

Después de terminar el aprendizaje analice:
- ¿Por qué MVC obtiene ese nombre? (puede apoyarse de https://www.javatpoint.com/spring-mvc-tutorial) 
- ¿Cuáles son las ventajas de usar MVC?
- ¿Qué diferencia tiene la estructura de directorios de este proyecto comparado con las de proyectos pasados (con solo maven y java EE)?
- ¿Qué anotaciones usaste y cuál es la diferencia entre ellas?

  ### PARTE III. - APLICACIÓN MVC PARA CONSUMO DE SERVICIO RESTful
  Usando la arquitectura MVC del punto anterior (el proyecto anterior), realice una aplicación simple qué permita navegar gráficamente sobre esta API
  https://jsonplaceholder.typicode.com/todos/1, puede guiarse de tutoriales como [https://medium.com/@nutanbhogendrasharma/consume-rest-api-in-spring
      boot-web application-354c404850f0](https://medium.com/@nutanbhogendrasharma/consume-rest-api-in-spring-boot-web-application-354c404850f0)

Luego de terminada esta parte responda:

- ¿Qué es RESTful?

  
- Si utilizo un framework como [Boostrap CSS](https://getbootstrap.com/) para qué el apartado gráfico se vea más profesional, ¿en qué capa se haría su uso?

  > en la capa de presentacion

### PARTE IV. - APLICACIÓN MVC JUEGO
¡Llego la hora del reto! Teniendo las bases del uso del framework, cree una nueva ruta, por ejemplo `/guess`, y agrege formulario básico con un campo llamado "número" (guía de como crear formularios HTML https://www.w3schools.com/html/)

Y vamos a implementar la lógica de nuestro juego:
1. Se trata de un juego en línea para adivinar un número, en el que el ganador, si acierta en la primera oportunidad, recibe $100.000. Luego, por cada intento fallido, el premio
se reduce en $10.000, como en los juegos de apuesta, es natural qué quede en saldos negativos.
2. El número a adivinar debe ser generado en cada intento y comparado con el número qué el usuario está insertando, es un número de 1 a 10.
3. Debe existir un botón de reset, qué permita al jugador iniciar de nuevo.
4. La capa de controlador debe procer el número del usuario mediante método `POST`.

Analice las siguientes situaciones:
- ¿Qué pasa si abro el sitio de juegos en dos navegadores difententes?
  
- Si quisiera qué a cada jugador le aparecieran independientemente sus respectivos saldos. ¿Qué habría que hacer?
  
  
## RESPUESTAS

### PARTE 1

- ¿Qué codigo de error sale?, revise el significado del mismo en la lista de códigos de estado HTTP.
- 
  > Sale el codigo de error 301, significa que la URI ha sido cambiada, sin embargo puede que vuelva
  
- ¿Qué otros códigos de error existen?, ¿En qué caso se manejarán?
  
  - Respuestas informativas (100–199),

  - Respuestas satisfactorias (200–299),
    
  - Redirecciones (300–399),
    
  - Errores de los clientes (400–499),
    
  - Errores de los servidores (500–599).


- ¿Cuál es la diferencia entre los verbos GET y POST? ¿Qué otros tipos de
peticiones existen?

    > POST: método que envía datos a un recurso para que los modifiquen,
    
    > GET: método para obtener soluciones a nuestras peticiones.
    
    > GET, POST, PUT, DELETE, HEAD, OPTIONS, PATCH, TRACE.

    
    
- ¿Cuáles son las diferencias con los diferentes parámetros?

    > curl -v
![image](https://github.com/Parralol/LAB05/assets/110953563/3d1ab104-2a85-48b5-befc-34c6eea5b650)

    > curl -i

  ![image](https://github.com/Parralol/LAB05/assets/110953563/721a0f9e-25a5-4655-ad28-111a94a9dbd1)

la diferencia se encuentra en el encabezado de la busqueda
### PARTE 2

 * ¿Por qué MVC obtiene ese nombre? (puede apoyarse de https://www.javatpoint.com/spring-mvc-tutorial)
    
      > Obtiene su nombre de su funcion como framework que sigue el patron de diseño Modelo-Vista-Controlador
      
    * ¿Cuáles son las ventajas de usar MVC?
      
      > Separa roles, es de pequeño tamaño, posee configuraciones poderosas para frameworks y aplicaciones, ayuda a el desarollo rapido de programas, permite reutilizar clases, es facil de testear y permite mappear mas sencillamente
  
    * ¿Qué diferencia tiene la estructura de directorios de este proyecto comparado con las de proyectos pasados (con solo maven y  java EE)?
      
        > La diferencia de directorios radica en que simplifica totalmente todos los directorios, generando asi un proyecto mas limpio
        
    * ¿Qué anotaciones usaste y cuál es la diferencia entre ellas?
      
      @SpringBootApplication
 
      >  Indica a una clase de configuracion que invoca a uno o mas metodos @Bean y tambien ejecuta la configuracion automtica y el escaneo de componentes
      
      @Controller

       > Indica que la clase anotada es un controlador.
      
      @GetMapping
 
        > Indica que este metodo sera ejecutado al recibir el comando GET

      @RequestParam

      Permite el ingreso de parameteros dentro de la URL para la manipulacion de informacion

### PARTE 3

Luego de terminada esta parte responda:

- ¿Qué es RESTful?
  
    >  es una interfaz que dos sistemas de computación utilizan para intercambiar información de manera segura a través de Internet.
    
- Si utilizo un framework como [Boostrap CSS](https://getbootstrap.com/) para qué el apartado gráfico se vea más profesional, ¿en qué capa se haría su uso?
  
### PARTE 4

- ¿Qué pasa si abro el sitio de juegos en dos navegadores difententes?
  
![image](https://github.com/Parralol/LAB05/assets/110953563/7926a485-0c2c-4d5e-8a42-fda34baab817)


  > Como podemos observar, los valores se actualizan para ambos jugadores, el jugador de abajo ya habia ganado, sin embargo al jugar mal el jugador de arriba, el puntaje se vio afectado.
   
  
- Si quisiera qué a cada jugador le aparecieran independientemente sus respectivos saldos. ¿Qué habría que hacer?
  
  > Buscar alguna manera en la cual el objeto tipo Guess sea ejecutado individualmente por cada usuario, de esta forma cada uno tendria sus propios valores
