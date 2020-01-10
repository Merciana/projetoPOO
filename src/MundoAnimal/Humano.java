package MundoAnimal;

public class Humano extends Mamifero{
    public boolean fala;

    public Humano(){
        this.fala = false;
    }

    public void falando(){
        fala = true;
    }
}
