package MundoAnimal;

public class Animal {
    public String nome;
    public int passos;

    public Animal(String nome, int passos){
        this.nome = nome;
        this.passos = passos;
    }

    public void locomover(){
        passos++;
    }
}
