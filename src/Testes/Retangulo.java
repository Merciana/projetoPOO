package Testes;

public class Retangulo {
    private int base;
    private int altura;

    public Retangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    public int calcula_a_area(){
        //return this.altura*this.base;
        return multiplicar();
    }
    private int multiplicar(){
        return this.altura*this.base;
    }
}
