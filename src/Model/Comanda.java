package Model;

public class Comanda {
    private Pedido[] pedidos;

    public Double calculo_de_valor(){
        Double total = Double.valueOf(0);

        for(int i = 0; i<pedidos.length; i++){
            Pedido um = pedidos[i];
            total += um.calculo_de_vlaor;
        }
        return total;
    }
}
