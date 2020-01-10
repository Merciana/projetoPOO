package Model;

public class Mesa {
   private int qtd_cadeiras;
   private boolean statusLivre = true;
   private Pessoa responsavel;
   private Integer numeroM;
   private Integer qtd_clientes;
   private Comanda comanda;
   private Integer capacidade;
   private Integer calculo_de_valor;


   public void ocupacaoMesa(int quantidadesclientes){
        if(quantidadesclientes<=this.capacidade && statusLivre) {
            this.statusLivre = false;
            this.qtd_clientes = quantidadesclientes;
            this.comanda = new Comanda();
        }
        else{
            return;
        }
    }
    public boolean StatusLivre(){
        return statusLivre;
    }


    public void desocuparMesa(double contaPaga){
        Double total = comanda.calculo_de_valor();
        if(contaPaga>=total){
            this.qtd_clientes = 0;
            this.statusLivre = true;
            this.comanda = null;
        }
    }
}