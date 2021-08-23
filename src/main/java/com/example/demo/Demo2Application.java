package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
        User usuario = new User();
        Seguidor seguidor1 = new Seguidor();
        Seguidor seguidor2 = new Seguidor();
        Seguidor seguidor3 = new Seguidor();

        usuario.agregarSeguidor(seguidor1);
        usuario.agregarSeguidor(seguidor2);
        usuario.agregarSeguidor(seguidor3);

        usuario.crearMensaje();

        usuario.eliminarSeguidor(seguidor1);

        usuario.crearMensaje();
    }

}
