package br.ufrn.tads.poo;

import java.math.BigDecimal;

public class ContaBancaria implements Banco{
    private Double saldo = 0.0;


    @Override
    public Double saldo() {
        return saldo;
    }

    @Override
    public void transferencia(Banco destino, Double valor) {
        if(this.saldo >= valor && valor > 0)
            this.saldo -= valor;
            destino.deposito(valor);
    }

    @Override
    public void saque(Double valor) {
        if(this.saldo >= valor)
            this.saldo -= valor;
    }

    @Override
    public void deposito(Double valor) {
        if(valor > 0)
            this.saldo += valor;
    }
}
