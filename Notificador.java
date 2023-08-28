package com.ada.pooii;

public class Notificador {


    public void notificaUsuario() {
        geraNotificacao();
        fazPushNotification();
    }

    private void fazPushNotification() {
        identificaDevice();
        enviaNotificacao();
    }

    private void enviaNotificacao() {
    }

    private void identificaDevice() {
    }

    private void geraNotificacao() {
    }
}
