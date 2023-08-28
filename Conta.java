package com.ada.pooii;

public class Conta {

    public static final int ZERO = 0;
    private Double saldo;

    private Integer branch;

    private Integer numero;

    public boolean fazerTransacao(double valor, TipoDeTransacao tipoDeTransacao) {

        if (!validarSeOLimiteFicaraValido(valor, tipoDeTransacao)) {
            return false;
        }

        efetivarTransacao(valor, tipoDeTransacao);
        return true;
    }

    private boolean validarSeOLimiteFicaraValido(double valor, TipoDeTransacao tipoDeTransacao) {
        if (tipoDeTransacao == TipoDeTransacao.DEBITO) {
            double saldoAtualizado = saldo - valor;
            if (saldoAtualizado < ZERO) {
                return false;
            }
        }
        return true;
    }

    private void efetivarTransacao(double valor, TipoDeTransacao tipoDeTransacao) {
        if (tipoDeTransacao == TipoDeTransacao.DEBITO) {
            saldo = saldo - valor;
        } else if (tipoDeTransacao == TipoDeTransacao.CREDITO) {
            saldo = saldo + valor;
        }
    }
}
