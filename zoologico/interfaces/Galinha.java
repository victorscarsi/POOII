package com.ada.pooii.zoologico.interfaces;

public class Galinha implements Animal, Voador {

    @Override
    public void movimentar() {
        System.out.println("Galinha Ciscando");
    }
}
