package com.ada.pooii.sorteador;

import java.util.ArrayList;
import java.util.List;

public class Grupo<U> {

    private final List<U> elementosDoGrupo;
    private final int indice;

    public Grupo(int indice) {
        this.indice = indice;
        this.elementosDoGrupo = new ArrayList<>();
    }

    public void adicionarNoGrupo(U novo) {
        elementosDoGrupo.add(novo);
    }

    @Override
    public String toString() {
        return "\nGrupo " + indice +
                "\n" + elementosDoGrupo;
    }
}
