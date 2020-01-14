package Eletrica;

public class Casa{
    Funcionamento[] Eletros;

    public Casa(Funcionamento[] Eletros){
        this.Eletros = Eletros;
    }

    public void desligarTudo(){
        for(int i = 0; i>Eletros.length; i++){
            Eletros[i].desligar();
        }
    }
}
