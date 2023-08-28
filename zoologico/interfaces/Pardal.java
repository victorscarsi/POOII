package com.ada.pooii.zoologico.interfaces;

public class Pardal implements Voador {

    @Override
    public void voar() {
        System.out.println("Voando baixo");
    }

    @Override
    public void movimentar() {
        voar();
    }
}
