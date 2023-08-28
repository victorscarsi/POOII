package com.ada.pooii.zoologico.interfaces;

public class Morcego implements Amamentador, Voador {
    @Override
    public void movimentar() {
        System.out.println("Morcego Voando");
    }
}
