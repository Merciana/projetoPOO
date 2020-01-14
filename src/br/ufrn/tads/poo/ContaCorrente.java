package br.ufrn.tads.poo;

public class ContaCorrente extends ContaBancaria {

    Double CqEspecial = 2000.0;

    @Override
    public void transferencia(Banco destino, Double valor) {
        if(valor > 0 && valor <= 2000 && valor <= (saldo + CqEspecial)) {
            this.saque(valor);
            destino.deposito(valor);
        }
    }

    @Override
    public void saque(Double valor) {
            if(valor > 0 && valor <= 2000 && valor <= (saldo + CqEspecial)) {
                this.saldo -= valor;
            }
    }
    public void pagamento(Double valor) {
        this.saque(valor);
    }
}
