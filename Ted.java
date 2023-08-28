package com.ada.pooii;

public class Ted {

    public void fazerTed(Conta conta, double valor, TipoDeTransacao tipoDeTransacao, Notificador notificador) {
        conta.fazerTransacao(valor, tipoDeTransacao);
        notificador.notificaUsuario();
    }


}
