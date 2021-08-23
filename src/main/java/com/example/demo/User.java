package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class User implements Sujeto {
    List<Observadores> seguidores;

    public User(){
        seguidores = new ArrayList<>();
    }

    public void agregarSeguidor(Observadores seguidor) {
        seguidores.add(seguidor);
    }

    public void eliminarSeguidor(Observadores seguidor) {
        seguidores.remove(seguidor);
    }

    public void crearMensaje() {
        System.out.println("Un mensaje");
        notificar();
    }

    public void notificar(){
        for (Observadores seguidor: seguidores){
            seguidor.recibirNotificacion();
        }
    }
}
