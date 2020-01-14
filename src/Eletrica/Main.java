package Eletrica;

public class Main {
    public static void main(String[] args){
        Funcionamento ar1 = new ArCondicionado();
        Funcionamento ar2 = new ArCondicionado();
        Funcionamento luz1 = new Luzes();
        Funcionamento luz2 = new Luzes();
        Funcionamento luz3 = new Luzes();
        Funcionamento luz4 = new Luzes();

        Funcionamento[] Eletro = {
                luz1, luz2, luz3, luz4, ar1, ar2
        };
        Casa casa = new Casa(Eletro);
        luz1.ligar();


        for(int i=0; i<Eletro.length; i++){
            System.out.println(Eletro[i].status());
        }
        System.out.println();
        ar1.desligar();


        for (int i=0; i<Eletro.length; i++){
            System.out.println(Eletro[i].status());
        }
    }
}
