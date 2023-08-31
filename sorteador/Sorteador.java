package com.ada.pooii.sorteador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteador {

    private final List<String> elementos;

    public static void main(String[] args) {
        List<String> elementos  = new ArrayList<>();
        elementos.add("banana");
        elementos.add("maçã");
        elementos.add("abacate");
        elementos.add("tomate");
        Sorteador sorteador = new Sorteador(elementos);
        while (!elementos.isEmpty()) {
            System.out.println("Elemento sorteado: " + sorteador.sortear());
        }
    }

    public Sorteador(List<String> elementos) {
        this.elementos = elementos;
    }

    public String sortear() {
        Random aleatorio = new Random();
        int posicaoSorteada = -1;
        posicaoSorteada = aleatorio.nextInt(elementos.size());
        String nomeSorteado = elementos.get(posicaoSorteada);
        elementos.remove(posicaoSorteada);
        return nomeSorteado;
    }
}
