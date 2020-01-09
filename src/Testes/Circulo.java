package Testes;

public class Circulo {
    private double raio;
    private static final double PI = 3,14;

    public circulo( double raio){
        this.raio = raio;
    }

    public double calculaArea(){
        return PI*raio*raio;
    }
    public double calcularPerimetro(){
        return 2*PI*raio;
    }
    public boolean ehMaior(final Circulo c){
        return this.raio > c.raio;
    }
}
