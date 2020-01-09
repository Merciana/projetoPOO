package br.ufrn.tads.poo;

import Testes.Circulo;
import Testes.Retangulo;

public class Main {
    public static void main(String[] args) {
        //maneira correta! de calcular este retangulo e não um retangulo qualquer
        // System.out.println("Hello world!");
        Retangulo r = new Retangulo(2, 4);
        int area = r.calcula_a_area();
        System.out.println("Area de r:" + r.calcula_a_area());

        r = new Retangulo(3, 4);
        System.out.println("Area de r:" + r.calcula_a_area());

        System.out.println(Circulo.PI);

        Integer a = null;
        Integer b = 3;
        System.out.println(a+b);
        }

    }
}
