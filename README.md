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
- Si utilizo un framework como [Boostrap CSS](https://getbootstrap.com/) para qué el apartado gráfico se vea más profesional, ¿en qué capa se haría su uso?

