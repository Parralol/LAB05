# LAB05

# INTEGRANTES
### Santiago Parra
### Gabriel Alejandro Silva Lozada

- PARTE 1.
  
  Conexion a www.escuelaing.edu.co:
  
    ![image](https://github.com/Parralol/LAB05/assets/110953563/b6ba4caf-823c-486c-818e-d7613f224f33)

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
  

