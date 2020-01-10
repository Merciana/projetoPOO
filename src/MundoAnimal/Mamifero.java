package MundoAnimal;

public class Mamifero extends Animal {
    public boolean mama;

    public Mamifero(){
        super("Mamifero", 2);
        mama = false;
    }

    public void Mamando() {
        mama = true;
    }
}
