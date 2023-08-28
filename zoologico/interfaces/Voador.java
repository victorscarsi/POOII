package com.ada.pooii.zoologico.interfaces;

public interface Voador extends Animal {

    default void voar() {
        System.out.println("Voando");
    }
}
