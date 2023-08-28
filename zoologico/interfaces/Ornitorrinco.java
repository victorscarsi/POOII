package com.ada.pooii.zoologico.interfaces;

public class Ornitorrinco implements Amamentador, Nadador {
    @Override
    public void movimentar() {
        System.out.println("Ornitorrinco Nadando");
    }
}
