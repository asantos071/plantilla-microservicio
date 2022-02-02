package com.boot.ejemplo.microservicio_ejemplo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    /** Peticion simple */
    @GetMapping(value = "saludo", produces = MediaType.TEXT_PLAIN_VALUE)
    public String saludo() {
        return "Microservicio Spring boot";
    }

    /** Pase de parametros url con PathVariable */
    @GetMapping(value = "saludo/{name}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String saludo(@PathVariable("name") String s_name) {
        return "Microservicio Spring boot " + "Bienvenido Sr/a " + s_name;
    }
   
      /** Pase de parametros url con RequestParam and QueryString */
      @GetMapping(value = "saludo/request", produces = MediaType.TEXT_PLAIN_VALUE)
      public String saludo(@RequestParam String s_name, @RequestParam String s_lname) {
          return "Microservicio Spring boot " + "Bienvenido Sr/a " + s_name + " " + s_lname;
      }
  
}
