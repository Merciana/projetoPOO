package Model;

public class Pedido {
    private Pratos prato;
    private Integer quantidade;

    public Double calculo_de_valor(){
        return this.prato.getValor() * this.quantidade;
    }
}
