# LAB05

# INTEGRANTES
### Santiago Parra
### Gabriel Alejandro Silva Lozada

- PARTE 1.
  
  Conexion a www.escuelaing.edu.co:
  
    ![image](https://github.com/Parralol/LAB05/assets/110953563/b6ba4caf-823c-486c-818e-d7613f224f33)
3. Antes de que el servidor cierre la conexión por falta de comunicación:
Revise la página 36 del RFC del protocolo HTTP, sobre cómo realizar una petición GET. Con esto, solicite al servidor el recurso ‘sssss/abc.html’, usando la versión 1.0 de HTTP.
Asegúrese de presionar ENTER dos veces después de ingresar el comando.
Revise el resultado obtenido. ¿Qué codigo de error sale?, revise el significado del mismo en la lista de códigos de estado HTTP.

  **Error 301: Se refiere a un error de tipo REDIRECCIONAMIENTO utilizando la version HTTP 1.0** 
**Resultado**

~~~
HTTP/1.1 301 Moved Permanently 
Date: Wed, 20 Sep 2023 11:47:19 GMT
Server: Apache/2.2.22 (Fedora)
Location: https://www.escuelaing.edu.co/sssss/abc.html
Content-Length: 339
Connection: close
Content-Type: text/html; charset=iso-8859-1
~~~

~~~
<!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">
<html><head>
<title>301 Moved Permanently</title>
</head><body>
<h1>Moved Permanently</h1>
<p>The document has moved <a href="https://www.escuelaing.edu.co/sssss/abc.html">here</a>.</p>
<hr>
<address>Apache/2.2.22 (Fedora) Server at www.escuelaing.edu.co Port 80</address>
</body></html>
Connection closed by foreign host.
~~~

¿Qué otros códigos de error existen?, ¿En qué caso se manejarán?
**Error 400: Se refiere a un error de tipo cliente utilizando la version HTTP 1.1** 
**Resultado**

~~~
HTTP/1.1 400 Bad Request
Date: Wed, 20 Sep 2023 11:39:23 GMT
Server: Apache/2.2.22 (Fedora)
Content-Length: 313
Connection: close
Content-Type: text/html; charset=iso-8859-1

<!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">
<html><head>
<title>400 Bad Request</title>
</head><body>
<h1>Bad Request</h1>
<p>Your browser sent a request that this server could not understand.<br />
</p>
<hr>
<address>Apache/2.2.22 (Fedora) Server at www.escuelaing.edu.co Port 80</address>
</body></html>
~~~


4. Realice una nueva conexión con telnet, esta vez a:
Host: www.httpbin.org
Puerto: 80
Versión HTTP: 1.1
Ahora, solicite (GET) el recurso /html. ¿Qué se obtiene como resultado?

**RESULTADO**

~~~
HTTP/1.1 400 Bad Request
Server: awselb/2.0
Date: Wed, 20 Sep 2023 12:35:43 GMT
Content-Type: text/html
Content-Length: 138
Connection: close`

`<html>
<head><title>400 Bad Request</title></head>
<body bgcolor="white">
<center><h1>400 Bad Request</h1></center>
</body>
</html>
~~~

5. Seleccione el contenido HTML de la respuesta y copielo al cortapapeles CTRL-SHIFT-C. Ejecute el comando wc (word count) para contar palabras con la opción -c para contar el número de caracteres:
**Resultado de la cantidad de caracteres **

➜  ~ wc -c resultado.txt      

6. En la practica no se utiliza telnet para hacer peticiones a sitios web sino el comando curl con ayuda de la linea de comandos:

**UTILIZANDO curl -v www.httpbin.org**

~~~
* Rebuilt URL to: www.httpbin.org/
*   Trying 52.202.2.199...
* TCP_NODELAY set
* Connected to www.httpbin.org (52.202.2.199) port 80 (#0)
> GET / HTTP/1.1
> Host: www.httpbin.org
> User-Agent: curl/7.58.0
> Accept: */*
~~~

**UTILIZANDO curl -i www.httpbin.org**

~~~
HTTP/1.1 200 OK
Date: Wed, 20 Sep 2023 12:58:46 GMT
Content-Type: text/html; charset=utf-8
Content-Length: 9593
Connection: keep-alive
Server: gunicorn/19.9.0
Access-Control-Allow-Origin: *
Access-Control-Allow-Credentials: true
~~~

- PARTE 2 HACIENDO UNA APLICACIÓN WEB DINÁMICA USANDO EL PATRÓN MVC.
  
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
      
      ### PARTE III. - APLICACIÓN MVC PARA CONSUMO DE SERVICIO RESTful
      Usando la arquitectura MVC del punto anterior (el proyecto anterior), realice una aplicación simple qué permita navegar gráficamente sobre esta API
          https://jsonplaceholder.typicode.com/todos/1, puede guiarse de tutoriales como [https://medium.com/@nutanbhogendrasharma/consume-rest-api-in-spring
      boot-web application-354c404850f0](https://medium.com/@nutanbhogendrasharma/consume-rest-api-in-spring-boot-web-application-354c404850f0)

Luego de terminada esta parte responda:
- ¿Qué es RESTful?
    >  es una interfaz que dos sistemas de computación utilizan para intercambiar información de manera segura a través de Internet.
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
![image](https://github.com/Parralol/LAB05/assets/110953563/7926a485-0c2c-4d5e-8a42-fda34baab817)


     > Como podemos observar, los valores se actualizan para ambos jugadores, el jugador de abajo ya habia ganado, sin embargo al jugar mal el jugador de arriba, el puntaje se vio afectado.
   
  
- Si quisiera qué a cada jugador le aparecieran independientemente sus respectivos saldos. ¿Qué habría que hacer?
  
  > Buscar alguna manera en la cual el objeto tipo Guess sea ejecutado individualmente por cada usuario, de esta forma cada uno tendria sus propios valores
  

