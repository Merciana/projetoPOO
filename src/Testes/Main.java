package Testes;

import Testes.Circulo;
import Testes.Retangulo;


public class Main {
    public static void main(String[] args) {
        //maneira correta! de calcular este retangulo e não um retangulo qualquer
        // System.out.println("Hello world!");
        Retangulo r = new Retangulo(2, 4);
        System.out.println("Area de r:" + r.calcula_a_area());

        Integer a = null;
        Integer b = 3;
        System.out.println(a+b);

        r = new Retangulo(3, 4);
        System.out.println("Area de r:" + r.calcula_a_area());
        }
}


        /*Humano Merciana = new Humano();
        Merciana.nome= "Merciana";
        System.out.println(Merciana.nome);
         */
