package Model;

public class Pratos {
    private String tipo_do_prato;
    private String nome;
    private String id;
    private String[] ingredientes;
    private Double valorDoPrato;

    public Double getValor(){
        return this.valorDoPrato;
    }
}
