package com.example.demo;

public interface Sujeto {
    public void agregarSeguidor(Observadores seguidor);
    public void eliminarSeguidor(Observadores seguidor);
    public void notificar();

}
