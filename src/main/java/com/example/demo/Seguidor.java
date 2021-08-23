package com.example.demo;

public class Seguidor implements Observadores{

    @Override
    public void recibirNotificacion(){
        System.out.println("Mesaje recibido");
    }
}
