package br.ufrn.tads.poo;

public interface Banco {
    Double saldo();
    void transferencia(Banco destino, Double valor);
    void saque(Double valor);
    void deposito(Double valor);
}
